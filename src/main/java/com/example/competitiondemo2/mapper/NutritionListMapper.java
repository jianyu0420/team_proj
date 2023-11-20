package com.example.competitiondemo2.mapper;

import com.example.competitiondemo2.pojo.NutritionList;

public interface NutritionListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NutritionList record);

    int insertSelective(NutritionList record);

    NutritionList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NutritionList record);

    int updateByPrimaryKey(NutritionList record);
}