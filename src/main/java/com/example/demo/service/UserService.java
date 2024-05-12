package com.example.demo.service;

import com.example.demo.models.User;
import com.example.demo.models.dto.UserDto;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public int create(UserDto userDto) {
        Optional<User> optionalUser = userRepository.findByLoginAndPassword(userDto.getLogin(), userDto.getPassword());
        if (optionalUser.isEmpty()) {
            User user = new User();
            user.setLogin(userDto.getLogin());
            user.setPassword(userDto.getPassword());
            user.setSex(userDto.getSex());
            user.setBirth(userDto.getBirth());
            user.setIsAdmin(userDto.getIsAdmin());
            userRepository.save(user);
        }
        return 0;
    }

//    public boolean delete() {
//
//    }
//
//    public User read() {
//
//    }
//
//    public int update() {
//
//    }
}
