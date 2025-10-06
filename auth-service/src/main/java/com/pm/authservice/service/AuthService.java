package com.pm.authservice.service;

import com.pm.authservice.model.User;
import com.pm.authservice.dto.LoginRequestDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    public Optional<String> authenticate(LoginRequestDTO loginRequestDTO) {
        Optional<User> user = userService.findBYEmail(loginRequestDTO.getEmail());
    }

}
