package com.example.competitiondemo2.mapper;

import com.example.competitiondemo2.pojo.ConsultTypelist;

public interface ConsultTypelistMapper {
    int deleteByPrimaryKey(Integer consultTypeId);

    int insert(ConsultTypelist record);

    int insertSelective(ConsultTypelist record);

    ConsultTypelist selectByPrimaryKey(Integer consultTypeId);

    int updateByPrimaryKeySelective(ConsultTypelist record);

    int updateByPrimaryKey(ConsultTypelist record);
}