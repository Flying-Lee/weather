package com.example.flying.weather.gson.Basic;

import com.google.gson.annotations.SerializedName;

/**
 * Created by flying on 2017/11/10.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }

}
