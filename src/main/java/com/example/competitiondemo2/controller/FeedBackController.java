package com.example.competitiondemo2.controller;

import com.example.competitiondemo2.Util.TokenUtil;
import com.example.competitiondemo2.base.Result;
import com.example.competitiondemo2.pojo.Feedback;
import com.example.competitiondemo2.pojo.LoginUser;
import com.example.competitiondemo2.pojo.User;
import com.example.competitiondemo2.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/feedback")
public class FeedBackController {
    @Autowired
    private FeedBackService feedBackService;

    TokenUtil tokenUtil;


    @GetMapping("/selectByUid")
    public List<Feedback> selectByUid(Integer u_id){
        List<Feedback> feedbackList = feedBackService.selectByUid(u_id);
        return feedbackList;
    }

    @GetMapping("/selectAll")
    public List<Feedback> selectAll(){
        List<Feedback> feedbackList = feedBackService.selectAll();
        return feedbackList;
    }

    @PostMapping("/addFeedBack")
    public Result addFeedBack(String content, HttpServletRequest request){
        String token = request.getHeader("token");
        Integer userId=tokenUtil.getUserId(token);
//        LoginUser loginUser = new LoginUser();
//        Integer userId= loginUser.getId();
        System.out.println("ID:"+userId);
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        Timestamp time= Timestamp.valueOf(format.format(date));
        System.out.println("Time:"+time);
        Result result = feedBackService.addFeedBack(userId,content,time);
        return result;
    }


}
