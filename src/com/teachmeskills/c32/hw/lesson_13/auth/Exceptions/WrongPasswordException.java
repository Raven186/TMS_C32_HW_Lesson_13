package com.teachmeskills.c32.hw.lesson_13.auth.Exceptions;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String message) {
        super(message);
    }
}
