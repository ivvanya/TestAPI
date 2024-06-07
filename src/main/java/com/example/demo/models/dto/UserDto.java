package com.example.demo.models.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
public class UserDto {
    private String login;
    private String password;
    private Boolean sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;
    private Boolean isAdmin;
}
