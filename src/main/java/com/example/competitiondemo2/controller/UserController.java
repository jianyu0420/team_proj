package com.example.competitiondemo2.controller;

import com.alibaba.fastjson.JSON;

import com.example.competitiondemo2.base.Result;
import com.example.competitiondemo2.pojo.User;
import com.example.competitiondemo2.service.UserService;
import org.apache.logging.log4j.util.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

import java.util.List;
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/queryAll")
    public List<User> queryAll(){
        List<User> userList = userService.queryAll();
        return userList;
    }

    @GetMapping("/byNameAndPwd")
    public User selectByPhoneAndPwd(String phonenum,String password){
        User user = userService.selectByPhoneAndPwd(phonenum,password);
        return user;
    }

    @GetMapping("/byPhone")
    public User selectByPhone(String phonenum){
        User user = userService.selectByPhone(phonenum);
        return user;
    }

    @GetMapping("/byName")
    public User selectByName(String username){
        User user = userService.selectByName(username);
        return user;
    }

    @GetMapping("/login")
    public String test1(){
        System.out.println(PropertiesUtil.class.getClassLoader().
                getResource("").getPath());
        return "登陆界面" ;
    }

    @PostMapping("/loginCheck")
    public Result login(String phonenum,String password,HttpServletResponse response){
        Result result =  userService.loginCheck(phonenum,password,response);
        return result;
    }

    @PostMapping("/register")
    public Result register(String uname,String password,String phonenum){
        Result result = userService.register(uname, password, phonenum);
        return result;
    }


}
