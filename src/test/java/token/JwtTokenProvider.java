package token;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.CompressionCodecs;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class JwtTokenProvider {

   SecretKey key;

    public JwtTokenProvider(String key){
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(),
                SignatureAlgorithm.HS512.getJcaName());
        this.key = secretKeySpec;
    }




    public String createToken(Claims claims){
        String compactJws = Jwts.builder().setClaims(claims).compressWith(CompressionCodecs.DEFLATE)
                .signWith(SignatureAlgorithm.HS512, key).compact();
        return compactJws;
    }


    public Claims parseToken(String token){
        return Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();

    }
}
