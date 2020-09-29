package com.chencan.springboot_apacheshiro.mapper;

import com.chencan.springboot_apacheshiro.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User findByUsername(@Param("username") String username);
}
