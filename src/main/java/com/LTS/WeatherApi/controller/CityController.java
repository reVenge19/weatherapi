package com.LTS.WeatherApi.controller;

import com.LTS.WeatherApi.exceptions.CityNotFoundException;
import com.LTS.WeatherApi.model.City;
import com.LTS.WeatherApi.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@SuppressWarnings("unused")
@RestController
public class CityController {
    @Value("${weather.apikey}")
    private String apikey;

    @GetMapping("/weather/{city}")
    public City getReqCity(@PathVariable("city") String reqCity) {
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + reqCity + "&appid=" + apikey;
        RestTemplate restTemplate = new RestTemplate();
        try{
            WeatherResponse weatherResponse = restTemplate.getForObject(url, WeatherResponse.class);
            float celsius;
            //JSON gives us temp in Kelvin, doing the maths to get it to celsius
            if (weatherResponse != null) {
                celsius = ((float) weatherResponse.getMain().getTemp() - 273.15F);
                return new City(weatherResponse.getWeather().get(0).getDescription(), String.format("%.2f", celsius));
            }
            throw new CityNotFoundException();
        } catch (RestClientException e){
            throw new CityNotFoundException();
        }
    }

}

