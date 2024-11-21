package com.example.wollet.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {

        super(message);

    }
}
