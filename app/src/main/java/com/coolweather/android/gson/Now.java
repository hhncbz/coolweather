package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zrt on 2017/8/25.
 */

public class Now {
    @SerializedName("tem")
    public  String temperature;

   @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
