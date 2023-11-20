package com.example.competitiondemo2.mapper;

import com.example.competitiondemo2.pojo.Food;

public interface FoodMapper {
    int deleteByPrimaryKey(Integer foodId);

    int insert(Food record);

    int insertSelective(Food record);

    Food selectByPrimaryKey(Integer foodId);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKeyWithBLOBs(Food record);

    int updateByPrimaryKey(Food record);
}