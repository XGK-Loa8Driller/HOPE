package com.QuizEngine.service;

import com.QuizEngine.model.User;

public class ResultService {

    public void showResult(User user) {
        System.out.println("\nFinal Score: " + user.getScore());
    }
}
