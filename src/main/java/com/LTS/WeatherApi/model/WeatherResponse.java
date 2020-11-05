package com.LTS.WeatherApi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Adding Data and NoArgsConstructor annotations so that lombok takes care of everything ;)
@Data
@NoArgsConstructor
public class WeatherResponse {

    private Coord coord;
    private List<Weather> weather;
    private String base;
    private Main main;
    public int visibility;
    private Wind wind;
    private Clouds clouds;
    public int dt;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;

}


