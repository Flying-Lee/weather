package com.example.flying.weather.gson.Forecast;

import com.google.gson.annotations.SerializedName;

/**
 * Created by flying on 2017/11/10.
 */

public class Forcast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }
}
