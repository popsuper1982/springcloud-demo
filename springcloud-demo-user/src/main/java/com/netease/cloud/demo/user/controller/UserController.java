package com.netease.cloud.demo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netease.cloud.demo.user.entity.User;
import com.netease.cloud.demo.user.repository.UserRepository;
/**
 * @author j.tommy
 * @version 1.0
 * @date 2018/1/24
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/sample/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.getOne(id);
    }
}
