package com.example.brs.exception;

public class UserNotFoundException extends NotFoundException {

    public UserNotFoundException() {
        super("USER_NOT_FOUND");
    }
}
