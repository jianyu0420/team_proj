package com.example.competitiondemo2.Util;

//自定义拦截器类

import org.springframework.web.servlet.HandlerInterceptor;
import tk.mybatis.mapper.util.StringUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationInterceptor implements HandlerInterceptor {

    TokenUtil tokenUtil;

    @Override
    public boolean preHandle (HttpServletRequest request ,
                              HttpServletResponse response , Object o)throws Exception{
        //检查请求中是否存在token ， 如果不存在就直接跳转到登陆页面
        String token = request.getHeader("token");
        System.out.println(token);
        if(token.isEmpty()==true){
            System.out.println("不存在token");
            response.sendRedirect("/login");
            return false ;
        }
        System.out.println(tokenUtil.getUserId(token));
        System.out.println("成功返回");
        return true ;
    }



}
