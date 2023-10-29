package com.example.competitiondemo2.controller;

import com.alibaba.fastjson.JSON;

import com.example.competitiondemo2.base.Result;
import com.example.competitiondemo2.pojo.User;
import com.example.competitiondemo2.service.UserService;
import org.apache.logging.log4j.util.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

import java.util.List;
@Controller
@RequestMapping(value = "/test")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/queryAll")
    public String queryAll(){
        List<User> userList = userService.queryAll();
        return JSON.toJSONString(userList);
    }

    @GetMapping("/byNP")
    public User selectByName(String uname,String password){
        User user = userService.selectByName(uname,password);
        return user;
    }

    @GetMapping("/login")
    public String test1(){
        System.out.println(PropertiesUtil.class.getClassLoader().
                getResource("").getPath());
        return "登陆界面" ;
    }

    @PostMapping("/loginCheck")
    @ResponseBody
    public Result login(String uname,String password,HttpServletResponse response){
        Result result =  userService.loginCheck(uname,password,response);
        return result;
    }


}
