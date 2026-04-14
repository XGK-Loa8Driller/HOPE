package com.QuizEngine.model;

import java.util.*;

public class Quiz {

    private List<Question> questions = new ArrayList<>();

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
