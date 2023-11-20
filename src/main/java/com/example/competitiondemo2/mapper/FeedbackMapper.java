package com.example.competitiondemo2.mapper;

import com.example.competitiondemo2.base.Result;
import com.example.competitiondemo2.pojo.Feedback;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
@Repository
@Mapper
public interface FeedbackMapper {
    List<Feedback> selectByUid(Integer u_id);

    List<Feedback> selectAll();

    int addFeedBack(Integer userId,String content, Timestamp time);
}