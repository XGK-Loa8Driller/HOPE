package com.QuizEngine.model;

import com.QuizEngine.interfaces.Executable;

public abstract class Question implements Executable {
    protected int id;
    protected String questionText;

    public Question(int id, String questionText) {
        this.id = id;
        this.questionText = questionText;
    }

    public int getId() {
        return id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public abstract boolean checkAnswer(String answer);
}
