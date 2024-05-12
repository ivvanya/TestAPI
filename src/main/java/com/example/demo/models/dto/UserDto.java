package com.example.demo.models.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserDto {
    private String login;
    private String password;
    private Boolean sex;
    private Date birth;
    private Boolean isAdmin;
}
