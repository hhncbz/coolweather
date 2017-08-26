package com.coolweather.android.gson;

/**
 * Created by zrt on 2017/8/25.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
