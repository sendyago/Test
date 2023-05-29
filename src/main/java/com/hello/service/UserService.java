package com.hello.service;

import com.hello.domain.User;

public interface UserService {

    String queryUserName(String id);

    User queryUserById(String id);
}
