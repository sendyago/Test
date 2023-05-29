package com.hello.controller;

import com.hello.domain.User;
import com.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户接口类
 */
@RestController("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 接口示例
     * 接口url：http://localhost:8080/user/name
     * @return Hello, world!
     */
    @GetMapping("/name")
    public String getName() {
        return "Hello, World!";
    }

    /**
     * 根据用户id查询用户名称
     * 接口url：http://localhost:8080/user/queryUserName/{id}
     * @param id 用户id
     * @return 用户名称
     */
    @GetMapping("/queryUserName/{id}")
    public String queryUserName(@PathVariable("id") String id) {
        if (id == null || "".equals(id)) {
            return "用户ID不能为空";
        }
        return userService.queryUserName(id);
    }

    /**
     * 根据用户ID返回用户信息
     * 接口url：http://localhost:8080/user/queryUserById/{id}
     * @param id 用户id
     * @return 用户信息
     */
    @GetMapping("/queryUserById/{id}")
    public User queryUserById(@PathVariable("id") String id) {
        if (id == null || "".equals(id)) {
            return new User();
        }
        return userService.queryUserById(id);
    }
 }
