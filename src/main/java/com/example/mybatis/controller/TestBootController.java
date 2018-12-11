package com.example.mybatis.controller;

import com.example.mybatis.pojo.User;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {

    @Autowired
    private UserService userService;

    @GetMapping("getUser")
    public User getUser() {
        return userService.getUser(1L);
    }

}
