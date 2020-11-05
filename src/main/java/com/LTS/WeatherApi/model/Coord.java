package com.LTS.WeatherApi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Coord {
    public double lon;
    public double lat;
}
