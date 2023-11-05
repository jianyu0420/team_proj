package com.example.competitiondemo2.service;

import com.example.competitiondemo2.base.Result;
import com.example.competitiondemo2.pojo.User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

import java.util.List;

public interface UserService {

    int insert(User record) ;

    int insertSelective(User record) ;

    List<User> queryAll();
    User selectByNP(String uname,String password);

    Result loginCheck(String phonenum,String password, HttpServletResponse response);

    User selectByPhone(String phonenum);

    User selectByName(String uname);

    Result register(String uname,String password,String phonenum);
}
