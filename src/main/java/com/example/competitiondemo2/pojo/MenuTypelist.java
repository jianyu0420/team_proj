package com.example.competitiondemo2.pojo;

import java.io.Serializable;

public class MenuTypelist implements Serializable {
    private Integer menuTypeId;

    private static final long serialVersionUID = 1L;

    public Integer getMenuTypeId() {
        return menuTypeId;
    }

    public void setMenuTypeId(Integer menuTypeId) {
        this.menuTypeId = menuTypeId;
    }
}