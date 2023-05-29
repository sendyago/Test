package com.hello.service.impl;

import com.hello.domain.User;
import com.hello.mapper.UserMapper;
import com.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务逻辑实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String queryUserName(String id) {
        return userMapper.queryUserName(id);
    }

    @Override
    public User queryUserById(String id) {
        return userMapper.queryUserById(id);
    }
}
