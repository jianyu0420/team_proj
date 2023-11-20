package com.example.competitiondemo2.mapper;

import com.example.competitiondemo2.pojo.Info;

public interface InfoMapper {
    int deleteByPrimaryKey(Integer infoId);

    int insert(Info record);

    int insertSelective(Info record);

    Info selectByPrimaryKey(Integer infoId);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKeyWithBLOBs(Info record);

    int updateByPrimaryKey(Info record);
}