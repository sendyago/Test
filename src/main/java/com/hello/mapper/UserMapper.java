package com.hello.mapper;

import com.hello.domain.User;

public interface UserMapper {

    String queryUserName(String id);

    User queryUserById(String id);
}
