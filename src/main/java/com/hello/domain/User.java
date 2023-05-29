package com.hello.domain;

import lombok.Data;

/**
 * 用户实体类
 */
@Data
public class User {

    /**
     * 用户id
     */
    private String id;

    /**
     * 用户名称
     */
    private String userName;
}
