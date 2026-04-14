package com.QuizEngine.model;

import java.util.List;

public class MCQQuestion extends Question {

    private List<String> options;
    private String correctAnswer;

    public MCQQuestion(int id, String questionText, List<String> options, String correctAnswer) {
        super(id, questionText);
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void execute() {
        System.out.println(questionText);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    @Override
    public boolean checkAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}
