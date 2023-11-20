package com.example.competitiondemo2.service.impl;

import com.example.competitiondemo2.Util.Results;
import com.example.competitiondemo2.base.Result;
import com.example.competitiondemo2.mapper.FeedbackMapper;
import com.example.competitiondemo2.pojo.Feedback;
import com.example.competitiondemo2.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class FeedBackServiceImpl implements FeedBackService {
    @Autowired
    private FeedbackMapper feedbackMapper;

    @Override
    public List<Feedback> selectAll() {
        return feedbackMapper.selectAll();
    }

    @Override
    public Feedback findById(Integer id) {
        return null;
    }

    @Override
    public List<Feedback> selectByUid(Integer u_id) {
        return feedbackMapper.selectByUid(u_id);
    }


    @Override
    public Result addFeedBack(Integer userId,String content, Timestamp time) {

        feedbackMapper.addFeedBack(userId,content,time);
        return Results.success("200","反馈成功");
    }
}
