package com.example.competitiondemo2.service;

import com.example.competitiondemo2.base.Result;
import com.example.competitiondemo2.pojo.User;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface UserService {

    int insert(User record) ;

    int insertSelective(User record) ;

    List<User> queryAll();
    User selectByPhoneAndPwd(String username,String password);

    Result loginCheck(String phonenum,String password, HttpServletResponse response);

    User selectByPhone(String phonenum);

    User selectByName(String username);

    Result register(String uname,String password,String phonenum);
}
