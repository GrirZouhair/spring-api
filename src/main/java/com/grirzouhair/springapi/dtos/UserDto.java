package com.grirzouhair.springapi.dtos;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class UserDto {
    @JsonIgnore
    private Long id;
    @JsonProperty("user_name")
    private String name;
    private String email;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String phone_number;
    @JsonFormat(pattern = "YY-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;
}
