package com.example.brs.exception;

import org.springframework.http.HttpStatus;

public class ApplicationException extends RuntimeException {
    private final HttpStatus status;
    private final String code;
    private final String message;
    private final Object details;

    public ApplicationException(String code) {
        this.status = HttpStatus.CONFLICT;
        this.code = code;
        this.message = null;
        this.details = null;
    }

    public ApplicationException(HttpStatus status, String code) {
        this.status = status;
        this.code = code;
        this.message = null;
        this.details = null;
    }

    public ApplicationException(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.details = null;
    }

    public ApplicationException(HttpStatus status, String code, String message, Object details) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.details = details;
    }

    public String getCode() {
        return code;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public Object getDetails() {
        return details;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public static class ExceptionResponseBody {
        private final String code;
        private final String message;

        public ExceptionResponseBody(String code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }
}
