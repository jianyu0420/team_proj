package com.example.competitiondemo2.mapper;

import com.example.competitiondemo2.pojo.MenuTypelist;

public interface MenuTypelistMapper {
    int deleteByPrimaryKey(Integer menuTypeId);

    int insert(MenuTypelist record);

    int insertSelective(MenuTypelist record);
}