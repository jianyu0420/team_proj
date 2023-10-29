package com.example.competitiondemo2.Util;

//自定义拦截器类

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import tk.mybatis.mapper.util.StringUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationInterceptor implements HandlerInterceptor {

    @Autowired
    TokenUtil tokenUtil ;

    @Override
    public boolean preHandle (HttpServletRequest request ,
                              HttpServletResponse response , Object o )throws Exception{
        //检查请求中是否存在token ， 如果不存在就直接跳转到登陆页面
        String token = tokenUtil.getToken(request) ;
        if(StringUtil.isEmpty(token)){
            System.out.println("不存在token");
            response.sendRedirect("/login");
            return false ;
        }
        return true ;
    }


}
