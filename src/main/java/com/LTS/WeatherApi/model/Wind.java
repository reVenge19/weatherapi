package com.LTS.WeatherApi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Wind {
    public double speed;
    public int deg;
}

