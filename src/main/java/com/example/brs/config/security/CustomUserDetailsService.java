package com.example.brs.config.security;

import com.example.brs.dto.UserDto;
import com.example.brs.repository.user.User;
import com.example.brs.service.user.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userService.findByEmail(username);
        return new UserDto(user, user.getAuthorities());
    }
}
