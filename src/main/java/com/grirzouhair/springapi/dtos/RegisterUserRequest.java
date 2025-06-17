package com.grirzouhair.springapi.dtos;

import com.grirzouhair.springapi.validation.Lowercase;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterUserRequest {
    //String validation
    @NotBlank(message = "name is required")
    @Size(max = 255, message = "message must be less than 255 char")
    private String name;
    @NotBlank(message = "email is required")
    @Email(message = "email must be valid")
    @Lowercase(message = "Email must be lower case")
    private String email;
    @NotBlank(message = "password required")
    @Size(min = 6, max = 25, message = "must be between 6 and 25 chars")
    private String password;
}
