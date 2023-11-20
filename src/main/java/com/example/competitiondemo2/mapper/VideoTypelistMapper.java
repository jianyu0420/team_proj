package com.example.competitiondemo2.mapper;

import com.example.competitiondemo2.pojo.VideoTypelist;

public interface VideoTypelistMapper {
    int deleteByPrimaryKey(Integer videoTypeId);

    int insert(VideoTypelist record);

    int insertSelective(VideoTypelist record);

    VideoTypelist selectByPrimaryKey(Integer videoTypeId);

    int updateByPrimaryKeySelective(VideoTypelist record);

    int updateByPrimaryKey(VideoTypelist record);
}