package com.QuizEngine.model;

public class User {

    private String name;
    private int score;

    public User(String name) {
        this.name = name;
        this.score = 0;
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
