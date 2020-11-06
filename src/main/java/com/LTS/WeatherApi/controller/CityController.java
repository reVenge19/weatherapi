package com.LTS.WeatherApi.controller;

import com.LTS.WeatherApi.model.City;
import com.LTS.WeatherApi.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@SuppressWarnings("unused")
@RestController
public class CityController {
    @Value("${weather.apikey}")
    private String apikey;

    @GetMapping("/weather/{city}")
    public City getReqCity(@PathVariable("city") String reqCity) {
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + reqCity + "&appid=" + apikey;
        RestTemplate restTemplate = new RestTemplate();
        WeatherResponse weatherResponse = restTemplate.getForObject(url, WeatherResponse.class);
        if (weatherResponse == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, String.format("The city %shas not been found", reqCity)
            );
        }
        float celsius;
        //JSON gives us temp in Kelvin, doing the maths to get it to celsius
        celsius = ((float) weatherResponse.getMain().getTemp() - 273.15F);
        return new City(weatherResponse.getWeather().get(0).getDescription(), String.format("%.2f", celsius));
    }
    @Controller
    public static class IndexController implements ErrorController {
        private final static String PATH = "/error";
        @Override
        @RequestMapping(PATH)
        @ResponseBody
        public String getErrorPath() {
            return "No Mapping Found";
        }

    }
}
