package com.example.competitiondemo2.mapper;

import com.example.competitiondemo2.pojo.Consult;

public interface ConsultMapper {
    int deleteByPrimaryKey(Integer consultId);

    int insert(Consult record);

    int insertSelective(Consult record);

    Consult selectByPrimaryKey(Integer consultId);

    int updateByPrimaryKeySelective(Consult record);

    int updateByPrimaryKey(Consult record);
}