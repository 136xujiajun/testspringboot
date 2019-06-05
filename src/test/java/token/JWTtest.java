package token;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.impl.DefaultClaims;

public class JWTtest {

    public static void main(String[] args) {

        //md5
        //数据库
        //校验密码是否正确

        JwtTokenProvider jwtTokenProvider = new JwtTokenProvider("012345");
        DefaultClaims claims = new DefaultClaims();
        claims.put("userId", "xulan");
        claims.put("username", "许岚");
        //token有效期

        String token = jwtTokenProvider.createToken(claims);
        System.out.println("生成的token:"+token);
        //解析Token
        Claims userClaims = jwtTokenProvider.parseToken(token);
        System.out.println("解析出来的Token内容:"+userClaims);


    }
}
