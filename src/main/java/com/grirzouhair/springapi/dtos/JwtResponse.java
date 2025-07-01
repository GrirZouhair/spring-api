package com.grirzouhair.springapi.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;


@Data
@AllArgsConstructor
public class JwtResponse {
    private String token;
}
