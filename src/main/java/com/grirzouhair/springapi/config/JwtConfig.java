package com.grirzouhair.springapi.config;

import io.jsonwebtoken.security.Keys;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.crypto.SecretKey;

@ConfigurationProperties(prefix = "spring.jwt")
@Configuration
@Data
public class JwtConfig {
    public String secret;
    public int accessTokenExpiration;
    public int refreshTokenExpiration;

    public SecretKey getSecretKey() {
        return Keys.hmacShaKeyFor(secret.getBytes());
    }
}
