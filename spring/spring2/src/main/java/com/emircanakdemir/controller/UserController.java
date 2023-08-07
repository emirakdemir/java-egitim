package com.emircanakdemir.controller;

import com.emircanakdemir.dto.User;
import com.emircanakdemir.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService = new UserServiceImpl();

    @GetMapping("users/{userId")
    public User getUserByID(@PathVariable("userId") Long userId){
        return userService.getUserById(userId);
    }
}
