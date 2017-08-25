package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zrt on 2017/8/25.
 */

public class Province extends DataSupport {
    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    private String provinceName;
    private int provinceCode;
}
