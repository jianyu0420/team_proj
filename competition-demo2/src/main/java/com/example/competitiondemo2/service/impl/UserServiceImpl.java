package com.example.competitiondemo2.service.impl;

import com.example.competitiondemo2.Util.Results;
import com.example.competitiondemo2.Util.TokenUtil;
import com.example.competitiondemo2.base.Result;
import com.example.competitiondemo2.mapper.UserMapper;
import com.example.competitiondemo2.pojo.User;
import com.example.competitiondemo2.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TokenUtil tokenUtil;

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }

    @Override
    public User selectByName(String uname,String pwd) {
        return userMapper.selectByName(uname,pwd);
    }

    @Override
    public Result loginCheck(String uname, String password, HttpServletResponse response) {
        User user1 = userMapper.selectByName(uname,password) ;
        if(user1 == null ){
            //response.sendRedirect("/login");
            return Results.failure("用户不存在,") ;
        }
        if(!user1.getPassword().equals(password)){
            return Results.failure("密码输入错误") ;
        }
        String token = tokenUtil.generateToken(user1) ;
        System.out.println("token:" + token);
        Cookie cookie = new Cookie("token" , token) ;
        // 设置cookie的作用域：为”/“时，以在webapp文件夹下的所有应用共享cookie
        cookie.setPath("/");
        response.addCookie(cookie);
        System.out.println("cookie:"+cookie);
        return Results.success("登陆成功") ;
    }


}
