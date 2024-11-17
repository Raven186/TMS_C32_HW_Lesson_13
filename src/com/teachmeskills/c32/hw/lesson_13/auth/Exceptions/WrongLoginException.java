package com.teachmeskills.c32.hw.lesson_13.auth.Exceptions;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String message) {
        super(message);
    }

}
