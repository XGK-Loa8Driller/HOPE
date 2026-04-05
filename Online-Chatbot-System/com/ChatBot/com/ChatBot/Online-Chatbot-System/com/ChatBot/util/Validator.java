package com.ChatBot.util;

public class Validator {

    public static boolean isValidInput(String input) {
        return input != null && !input.trim().isEmpty();
    }
}
