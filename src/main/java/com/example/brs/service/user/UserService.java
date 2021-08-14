package com.example.brs.service.user;

import com.example.brs.repository.user.User;

public interface UserService {
    User findByEmail(String email);
}
