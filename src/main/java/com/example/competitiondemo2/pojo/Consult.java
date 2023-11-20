package com.example.competitiondemo2.pojo;

import java.io.Serializable;

public class Consult implements Serializable {
    private Integer consultId;

    private String name;

    private Integer consultTypeId;

    private String recofood;

    private String url;

    private String describe;

    private static final long serialVersionUID = 1L;

    public Integer getConsultId() {
        return consultId;
    }

    public void setConsultId(Integer consultId) {
        this.consultId = consultId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getConsultTypeId() {
        return consultTypeId;
    }

    public void setConsultTypeId(Integer consultTypeId) {
        this.consultTypeId = consultTypeId;
    }

    public String getRecofood() {
        return recofood;
    }

    public void setRecofood(String recofood) {
        this.recofood = recofood == null ? null : recofood.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}