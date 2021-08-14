package com.example.brs.dto;

import com.example.brs.repository.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserDto extends org.springframework.security.core.userdetails.User {
    private final User user;

    public UserDto(User user, Collection<? extends GrantedAuthority> authorities) {
        super(user.getUsername(), user.getPassword(), authorities);
        this.user = user;
    }
}