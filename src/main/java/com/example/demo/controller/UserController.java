package com.example.demo.controller;

import com.example.demo.models.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public String create(@RequestBody UserDto userDto) {
        userService.create(userDto);
        return "good";
    }
}
