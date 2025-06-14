package com.grirzouhair.springapi.mappers;

import com.grirzouhair.springapi.dtos.UserDto;
import com.grirzouhair.springapi.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/*
componentModel = "spring" tells MapStruct to generate
the implementation as a Spring Bean.
 */
@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    UserDto toDto(User user);
}
