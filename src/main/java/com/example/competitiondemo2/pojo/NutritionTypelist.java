package com.example.competitiondemo2.pojo;

import java.io.Serializable;

public class NutritionTypelist implements Serializable {
    private Integer typeid;

    private String detail;

    private static final long serialVersionUID = 1L;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}