package com.pm.authservice.service;

import org.springframework.stereotype.Service;
import com.pm.authservice.model.User;

import java.util.Optional;


@Service
public class UserService {

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);

    }
}
