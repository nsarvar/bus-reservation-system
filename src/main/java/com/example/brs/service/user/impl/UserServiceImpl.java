package com.example.brs.service.user.impl;

import com.example.brs.exception.UserNotFoundException;
import com.example.brs.repository.user.User;
import com.example.brs.repository.user.UserRepository;
import com.example.brs.service.user.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(UserNotFoundException::new);
    }
}
