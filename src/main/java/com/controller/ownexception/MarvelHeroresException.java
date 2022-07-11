package com.controller.ownexception;

public class MarvelHeroresException extends RuntimeException {

    public MarvelHeroresException(String message) {
        super(message);
    }

    public MarvelHeroresException(String message, Exception exception) {
        super(message, exception);
    }
}