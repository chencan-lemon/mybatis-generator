package com.chencan.springboot_apacheshiro.service;


import com.chencan.springboot_apacheshiro.mapper.UserMapper;
import com.chencan.springboot_apacheshiro.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
