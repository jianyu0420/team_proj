package com.example.competitiondemo2.mapper;

import com.example.competitiondemo2.pojo.FoodTypelist;

public interface FoodTypelistMapper {
    int deleteByPrimaryKey(Integer foodTypeId);

    int insert(FoodTypelist record);

    int insertSelective(FoodTypelist record);

    FoodTypelist selectByPrimaryKey(Integer foodTypeId);

    int updateByPrimaryKeySelective(FoodTypelist record);

    int updateByPrimaryKey(FoodTypelist record);
}