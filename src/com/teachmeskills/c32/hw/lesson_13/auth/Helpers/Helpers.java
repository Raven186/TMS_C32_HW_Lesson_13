package com.teachmeskills.c32.hw.lesson_13.auth.Helpers;

public class Helpers {
    public static boolean isContainSpaces(String login) {
        char[] chars = login.toCharArray();
        for (char c : chars) {
            if (c == ' ') {
                return true;
            }
        }
        return false;
    }

    public static boolean isStandartLength(String string) {
        if (string.length() < 20) {
            return true;
        }
        return false;
    }

    public static boolean isContainDigits(String password) {
            return password.matches(".*\\d.*");
    }

    public static boolean isTwoStringsEqual(String string1, String string2) {
        if (string1.equals(string2)) {
            return true;
        }
        return false;
    }

}
