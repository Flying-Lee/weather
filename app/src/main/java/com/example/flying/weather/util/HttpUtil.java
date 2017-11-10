package com.example.flying.weather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by flying on 2017/11/9.
 */

public class HttpUtil {

    public static void sendRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
