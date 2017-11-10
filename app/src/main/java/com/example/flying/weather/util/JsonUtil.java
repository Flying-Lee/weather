package com.example.flying.weather.util;

import java.lang.reflect.Type;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

/**
 * Created by flying on 2017/11/8.
 */

public class JsonUtil {

    static Gson mGson;

    /**
     * <T>       代表声明使用泛型
     * T         返回的类型是我们使用的类型
     * Class<T>  类型.class
     */
    public static <T> T parseJson(String json, Class<T> tClass) {

        if(mGson == null){
            mGson = new Gson();
        }

        if(TextUtils.isEmpty(json)){
            return null ;
        }

        return mGson.fromJson(json,tClass);


    }

    public static <T> List<T> jsonToList(String json, Class<T[]> clazz) {
        T[] array = mGson.fromJson(json, clazz);
        return Arrays.asList(array);
    }

    public static <T> ArrayList<T> jsonToArrayList(String json, Class<T> clazz)
    {
        Type type = new TypeToken<ArrayList<JsonObject>>()
        {}.getType();
        ArrayList<JsonObject> jsonObjects = new Gson().fromJson(json, type);

        ArrayList<T> arrayList = new ArrayList<>();
        for (JsonObject jsonObject : jsonObjects)
        {
            arrayList.add(new Gson().fromJson(jsonObject, clazz));
        }
        return arrayList;
    }


}
