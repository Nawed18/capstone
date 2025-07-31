package com.bookmyground.Capstone.controller;

import com.bookmyground.Capstone.Entity.System_user;
import com.bookmyground.Capstone.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public System_user.User register(@RequestBody System_user.User user){
        return userService.register(user);
    }
}
