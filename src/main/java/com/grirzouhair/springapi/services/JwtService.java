package com.grirzouhair.springapi.services;

import com.grirzouhair.springapi.config.JwtConfig;
import com.grirzouhair.springapi.entities.Role;
import com.grirzouhair.springapi.entities.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Date;

@AllArgsConstructor
@Data
@Service
public class JwtService {
    private final JwtConfig jwtConfig;
    public String generateAccessToken(User user) {
        return generateToken(user, jwtConfig.accessTokenExpiration);
    }

    public String generateRefreshToken(User user) {
        return generateToken(user, jwtConfig.refreshTokenExpiration);
    }

    private String generateToken(User user, long tokenExpiration) {
        return Jwts.builder()
                .subject(user.getId().toString())
                .claim("email", user.getEmail())
                .claim("name", user.getName())
                .claim("role", user.getRole())
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 1000 * tokenExpiration))
                .signWith(jwtConfig.getSecretKey())
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            var claims = getClaims(token);
            return claims.getExpiration().after(new Date());
        } catch (JwtException e) {
            return false;
        }
    }

    private Claims getClaims(String token) {
        return Jwts.parser().verifyWith(jwtConfig.getSecretKey())
                .build().parseSignedClaims(token).getPayload();
    }
    public Long getUserIdFromToken(String token) {
        return Long.valueOf(getClaims(token).getSubject());
    }
    public Role getRoleFromToken(String token) {
        return Role.valueOf(getClaims(token).get("role", String.class));
    }
}

