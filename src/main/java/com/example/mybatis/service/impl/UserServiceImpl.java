package com.example.mybatis.service.impl;

import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.pojo.User;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
