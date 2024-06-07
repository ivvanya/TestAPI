package com.example.demo.controller;

import com.example.demo.models.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("user", new UserDto());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("user") UserDto userDto) {
        userService.create(userDto);
        return "good";
    }
}
