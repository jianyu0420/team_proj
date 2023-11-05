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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

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
    public User selectByNP(String uname,String pwd) {
        return userMapper.selectByNP(uname,pwd);
    }


    @Override
    public Result loginCheck(String phonenum, String password, HttpServletResponse response) {
        User user1 = userMapper.selectByNP(phonenum,password) ;
        User user2 = userMapper.selectByPhone(phonenum);
        if (user2==null){
            return Results.failure("手机号不存在");
        }else {
            if(user1 == null ){
                return Results.failure("手机号或密码输入错误") ;
            }
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

    @Override
    public User selectByPhone(String phonenum) {
        return userMapper.selectByPhone(phonenum);
    }

    @Override
    public User selectByName(String uname) {
        return userMapper.selectByName(uname);
    }


    public static boolean isLegalPhone(String phonenum) throws PatternSyntaxException {
        String regex = "^((13[0-9])|(14[05679])|(15([0-3,5-9]))|(16[2567])|(17[01235678])|(18[0-9]|19[135689]))\\d{8}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phonenum);
        return m.matches();
    }

    public static boolean isLegalPwd(String password) throws PatternSyntaxException {
        //（1）^匹配开头
        //（2）(?![A-Za-z0-9]+$)匹配后面不全是（大写字母或小写字母或数字）的位置，排除了（大写字母、小写字母、数字）的1种2种3种组合
        //（3）(?![a-z0-9\\W]+$)同理，排除了（小写字母、数字、特殊符号）的1种2种3种组合
        //（4）(?![A-Za-z\\W]+$)同理，排除了（大写字母、小写字母、特殊符号）的1种2种3种组合
        //（5）(?![A-Z0-9\\W]+$)同理，排除了（大写字母、数组、特殊符号）的1种2种3种组合
        //（6）[a-zA-Z0-9\\W]匹配（小写字母或大写字母或数字或特殊符号）因为排除了上面的组合，所以就只剩下了4种都包含的组合了
        //（7）{8,}8位以上
        //（8）$匹配字符串结尾
        String regex = "^(?![A-Za-z0-9]+$)(?![a-z0-9\\W]+$)(?![A-Za-z\\W]+$)(?![A-Z0-9\\W]+$)[a-zA-Z0-9\\W]{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        if (m.matches()==true){
            return true;
        }

        return false;
    }

    @Override
    public Result register(String uname, String password, String phonenum) {
        User user2=userMapper.selectByName(uname);
        User user3=userMapper.selectByPhone(phonenum);
        System.out.println("user3:"+user3);
        if (user3!=null||isLegalPhone(phonenum)==false){
            return Results.failure("手机号输入错误,或已存在");

        }
        System.out.println("user2:"+user2);
        if (user2!=null){
            return Results.failure("2","用户名已存在");
        }
        if (isLegalPwd(password)==false) {
            return Results.failure("1","密码不能含特殊字符,并且不能小于6位");
        }
        userMapper.register(uname,password,phonenum);
        return Results.success("3","注册成功");
    }


}
