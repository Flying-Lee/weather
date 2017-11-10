package com.example.flying.weather.gson.Weather;

import com.example.flying.weather.gson.AQI.AQI;
import com.example.flying.weather.gson.Basic.Basic;
import com.example.flying.weather.gson.Forecast.Forcast;
import com.example.flying.weather.gson.Now.Now;
import com.example.flying.weather.gson.Suggestion.Suggestion;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by flying on 2017/11/10.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forcast> forcastList;

}
