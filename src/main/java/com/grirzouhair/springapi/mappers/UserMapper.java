package com.grirzouhair.springapi.mappers;

import com.grirzouhair.springapi.dtos.UserDto;
import com.grirzouhair.springapi.entities.User;
import org.mapstruct.Mapper;

/*
componentModel = "spring" tells MapStruct to generate
the implementation as a Spring Bean.
 */
@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}
