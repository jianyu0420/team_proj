package com.example.competitiondemo2.mapper;

import com.example.competitiondemo2.pojo.InfoTypelist;

public interface InfoTypelistMapper {
    int deleteByPrimaryKey(Integer infoListId);

    int insert(InfoTypelist record);

    int insertSelective(InfoTypelist record);

    InfoTypelist selectByPrimaryKey(Integer infoListId);

    int updateByPrimaryKeySelective(InfoTypelist record);

    int updateByPrimaryKey(InfoTypelist record);
}