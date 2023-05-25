package com.veterinaria.veterinaria.service;

import com.veterinaria.veterinaria.model.LogueoUser;
import com.veterinaria.veterinaria.repository.LoginUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class LoginUserService {


    private final LoginUserRepository loginUserRepository;

    public List<LogueoUser> getUsers(){
        return loginUserRepository.findAll();
    }

}
