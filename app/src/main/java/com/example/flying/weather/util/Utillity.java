package com.example.flying.weather.util;

import android.text.TextUtils;
import android.util.Log;

import com.example.flying.weather.db.City;
import com.example.flying.weather.db.County;
import com.example.flying.weather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by flying on 2017/11/9.
 */

public class Utillity {

    public  static boolean handleProvinceResponse(String response) {

        if (!TextUtils.isEmpty(response)) {

            try {
                List<Province> provinces = JsonUtil.jsonToArrayList(response, Province.class);

                Log.e("Utillty", provinces.toString());

                for (Province province : provinces) {

                    province.save();

                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return false;

    }

    public  static boolean handleCityResponse(String response, int provinceId) {

        if (!TextUtils.isEmpty(response)) {

            try {
                List<City> cities = JsonUtil.jsonToArrayList(response, City.class);

                Log.e("Utillty", cities.toString());

//            city.save();

                return true;

            } catch (Exception e) {
                e.printStackTrace();
            }




        }

        return false;

    }

    public  static boolean handleCountyResponse(String response, int cityId) {

        if (!TextUtils.isEmpty(response)) {

//            County county = JsonUtil.parseJson(response, County.class);

//            county.save();

            return true;
        }

        return false;

    }

}