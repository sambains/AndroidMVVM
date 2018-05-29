package com.sambains.androidmvvm.helpers;

public class StringHelper {

    public static boolean stringIsNumber(String input) {
        return !stringIsEmpty(input) && stringIsInteger(input);
    }

    private static boolean stringIsEmpty(String input) {
        return input == null || input.length() == 0;
    }

    private static boolean stringIsInteger(String input) {
        boolean stringIsInteger;

        try {
            Integer.parseInt(input);
            stringIsInteger = true;
        } catch (NumberFormatException e) {
            stringIsInteger = false;
        }

        return !stringIsEmpty(input) && stringIsInteger;
    }
}
