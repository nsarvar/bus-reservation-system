package com.example.brs.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends ApplicationException {

    protected NotFoundException(String code) {
        super(HttpStatus.NOT_FOUND, code);
    }
}
