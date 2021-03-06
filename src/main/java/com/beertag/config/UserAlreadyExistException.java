package com.beertag.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserAlreadyExistException extends Exception{
    public UserAlreadyExistException() {
        super("Username already taken");
    }
}
