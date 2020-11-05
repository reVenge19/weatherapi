package com.LTS.WeatherApi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Sys {
    public int type;
    public int id;
    public String country;
    public int sunrise;
    public int sunset;
}
