package com.example.cloudarchitect.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class MemberException extends RuntimeException {

    private final HttpStatus httpStatus;

    public MemberException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}