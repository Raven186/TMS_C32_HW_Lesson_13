package com.teachmeskills.c32.hw.lesson_13.auth.Auth;

import com.teachmeskills.c32.hw.lesson_13.auth.Exceptions.WrongLoginException;
import com.teachmeskills.c32.hw.lesson_13.auth.Exceptions.WrongPasswordException;
import com.teachmeskills.c32.hw.lesson_13.auth.Helpers.Helpers;

import java.util.Arrays;

public class Auth implements IAuth{
    private String login;
    private String password;
    private String confirmPassword;

    public Auth(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    @Override
    public boolean auth() {

        if (!Helpers.isStandartLength(this.login)
                || Helpers.isContainSpaces(this.login)) {
            throw new WrongLoginException("Wrong login");
        } else if  (!Helpers.isStandartLength(this.password)
                || Helpers.isContainSpaces(this.password)
                || !Helpers.isContainDigits(this.password)) {
            throw new WrongPasswordException("Wrong password");
        } else if (!Helpers.isTwoStringsEqual(this.password, this.confirmPassword)) {
            throw new WrongPasswordException("Passwords do not match");
        }
        return true;
    }
}
