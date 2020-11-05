package com.LTS.WeatherApi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Weather {
    public int id;
    public String main;
    public String description;
    public String icon;
}
