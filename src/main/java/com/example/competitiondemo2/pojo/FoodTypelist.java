package com.example.competitiondemo2.pojo;

import java.io.Serializable;

public class FoodTypelist implements Serializable {
    private Integer foodTypeId;

    private String name;

    private static final long serialVersionUID = 1L;

    public Integer getFoodTypeId() {
        return foodTypeId;
    }

    public void setFoodTypeId(Integer foodTypeId) {
        this.foodTypeId = foodTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}