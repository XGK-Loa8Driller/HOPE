package com.QuizEngine.util;

public class Validator {

    public static void validateText(String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
    }
}
