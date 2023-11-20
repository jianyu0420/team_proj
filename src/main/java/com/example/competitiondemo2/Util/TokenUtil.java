package com.example.competitiondemo2.Util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.competitiondemo2.pojo.LoginUser;
import com.example.competitiondemo2.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Component
public class TokenUtil {

    public static final String SECRET = "SECRET";
    
    /*
     * 生成token
     * */
    public String generateToken(User user){
        Date start  = new Date() ;
        long currentTime = System.currentTimeMillis() + 60*60*1000 ; //一小时的有效时间
        Date end = new Date(currentTime) ;
        String token = "" ;
        token = JWT.create()
                .withAudience(Integer.toString(user.getId()))
                .withIssuedAt(start)
                .withExpiresAt(end)
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token ;
    }

    /*
     * 获取指定token中某个属性值
     * */
    public static Integer getUserId(String token){
        List<String> list = JWT.decode(token).getAudience();
        Integer userId = Integer.valueOf(list.get(0).trim());
        LoginUser loginUser = new LoginUser();
        loginUser.setId(userId);
        return userId;
    }
    /*
     * 获取request
     * */
    public static HttpServletRequest getRequest(){
        System.out.println("11");
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return requestAttributes == null ? null : requestAttributes.getRequest() ;
    }

    /*
     * 获取token
     * */
    public String getToken(HttpServletRequest request)  {
//        System.out.println(request);
        Cookie[] cookies = request.getCookies();
        for(Cookie c : cookies){
            if(c.getName() == "token"){
                return c.getValue() ;
            }
        }
        return null ;
    }

}
