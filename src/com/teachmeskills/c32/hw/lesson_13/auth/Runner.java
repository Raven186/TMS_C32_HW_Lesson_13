package com.teachmeskills.c32.hw.lesson_13.auth;

import com.teachmeskills.c32.hw.lesson_13.auth.Auth.Auth;
import com.teachmeskills.c32.hw.lesson_13.auth.Auth.IAuth;
import com.teachmeskills.c32.hw.lesson_13.auth.Exceptions.WrongLoginException;
import com.teachmeskills.c32.hw.lesson_13.auth.Exceptions.WrongPasswordException;

public class Runner {
    public static void main(String[] args) {
        IAuth user1 = new Auth("login", "password123", "password123");
        IAuth user2 = new Auth("login With Spaces", "password123", "password123");
        IAuth user3 = new Auth("thisStringContainsMoreThan20Symbols", "password123", "password123");
        IAuth user4 = new Auth("login", "passwordWithNoDigits", "passwordWithNoDigits");
        IAuth user5 = new Auth("login", "password111", "pasword111");
        try {
            user1.auth();
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("User1: " + e.getMessage());
        }
        try {
            user2.auth();
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("User2: " + e.getMessage());
        }
        try {
            user3.auth();
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("User3: " + e.getMessage());
        }
        try {
            user4.auth();
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("User4: " + e.getMessage());
        }
        try {
            user5.auth();
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("User5: " + e.getMessage());
        }
    }
}
