package com.example.turbo.meweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Turbo on 2016/12/11.
 */

public class Province extends DataSupport {
    private int id;

    private String provinceName;

    private int ProvinceCode;

    public int getId(){
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return ProvinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.ProvinceCode = provinceCode;
    }
}
