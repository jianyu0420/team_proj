package com.example.competitiondemo2.pojo;

import java.io.Serializable;

public class ConsultTypelist implements Serializable {
    private Integer consultTypeId;

    private String type;

    private static final long serialVersionUID = 1L;

    public Integer getConsultTypeId() {
        return consultTypeId;
    }

    public void setConsultTypeId(Integer consultTypeId) {
        this.consultTypeId = consultTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}