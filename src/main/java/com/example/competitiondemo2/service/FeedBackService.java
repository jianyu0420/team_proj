package com.example.competitiondemo2.service;

import com.example.competitiondemo2.base.Result;
import com.example.competitiondemo2.pojo.Feedback;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public interface FeedBackService {
    List<Feedback> selectAll();
    Feedback findById(Integer id);
    List<Feedback> selectByUid(Integer uid);

    Result addFeedBack(Integer userId,String content, Timestamp time);
}
