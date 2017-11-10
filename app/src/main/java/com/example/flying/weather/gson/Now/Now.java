package com.example.flying.weather.gson.Now;

import com.google.gson.annotations.SerializedName;

/**
 * Created by flying on 2017/11/10.
 */

public class Now {

    public String tmp;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
