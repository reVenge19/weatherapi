package com.LTS.WeatherApi.controller;

import com.LTS.WeatherApi.model.City;
import com.LTS.WeatherApi.model.WeatherResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class CityController {
    //Declaring String with API Key as value
    private static final String apikey = "ad43400b220daeedd0e9bfcf751bdf0c";
    //Creating endpoint
    @GetMapping("/weather/{city}")
    //Adding Path Variable anotation for URL
    public City getReqCity(@PathVariable("city") String reqCity) {
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + reqCity + "&appid=" + apikey;
        RestTemplate restTemplate = new RestTemplate();
        WeatherResponse weatherResponse = restTemplate.getForObject(url, WeatherResponse.class);
        //JSON gives us temp in Kelvin, doing the maths to get it to celsius
        float celsius = ((float) weatherResponse.getMain().getTemp() - 273.15F);
        //could've been done with DecimalFormat
        City city = new City(weatherResponse.getWeather().get(0).getDescription(), String.format("%.2f", celsius));
        return city;
    }

}
