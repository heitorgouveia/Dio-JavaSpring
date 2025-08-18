package spring.jwt.json_web_token.security;

import java.util.List;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

public class JWTCreator {

    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String ROLES_AUTHORITIES = "authorities";

    private static List<String> checkRoles(List<String> roles) {
        // You can add validation or transformation logic here if needed
        return roles;
    }

    public static String create(String prefix, String key, JWTObject jwtObject) {
        String token = Jwts.builder().setSubject(jwtObject.getSubject()).setIssuedAt(jwtObject.getIssuedAt()).setExpiration(jwtObject.getExpiration())
                .claim(ROLES_AUTHORITIES, checkRoles(jwtObject.getRoles())).signWith(SignatureAlgorithm.HS512, key).compact();
        return prefix + " " + token;

}

public static JWTObject create(String token, String prefix, String key)
        throws ExpiredJwtException, UnsupportedJwtException, IllegalArgumentException, MalformedJwtException, SignatureException {
        JWTObject jwtObject = new JWTObject();
        token = token.replace(prefix + " ", "");
        Claims claims = Jwts.parser().setSigningKey(key).build().parseClaimsJws(token).getBody();
        jwtObject.setSubject(claims.getSubject());
        jwtObject.setIssuedAt(claims.getIssuedAt());
        jwtObject.setExpiration(claims.getExpiration());
        Object rolesObj = claims.get(ROLES_AUTHORITIES);
        List<String> roles;
        if (rolesObj instanceof List<?>) {
            roles = ((List<?>) rolesObj).stream()
                .map(Object::toString)
                .toList();
        } else {
            roles = List.of();
        }
        jwtObject.setRoles(roles);
        return jwtObject;
    }

}
