package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.model.LogueoUser;
import com.veterinaria.veterinaria.service.LoginUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("login")
@AllArgsConstructor
public class LoginUserController {


    private final LoginUserService loginUserService;

    @GetMapping
    public List<LogueoUser> login(){
        return loginUserService.getUsers();
    }

}
