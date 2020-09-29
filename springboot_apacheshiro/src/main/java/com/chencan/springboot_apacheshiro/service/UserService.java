package com.chencan.springboot_apacheshiro.service;


import com.chencan.springboot_apacheshiro.model.User;

public interface UserService {

    User findByUsername(String username);
}
