package com.upskilling.mapper;

import org.apache.catalina.mapper.Mapper;

import com.upskilling.dto.UserDto;
import com.upskilling.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mapper.getMapper(AutoUserMapper.class);

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}
