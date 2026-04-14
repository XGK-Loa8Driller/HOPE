package com.QuizEngine.main;

import com.QuizEngine.model.*;
import com.QuizEngine.service.*;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        User user = new User("Aditya");

        Quiz quiz = new Quiz();

        quiz.addQuestion(new MCQQuestion(
                1,
                "What is Java?",
                Arrays.asList("Language", "Animal", "Car", "OS"),
                "Language"
        ));

        quiz.addQuestion(new MCQQuestion(
                2,
                "OOP stands for?",
                Arrays.asList("Object Oriented Programming", "Only One Program", "Other Option", "None"),
                "Object Oriented Programming"
        ));

        TimerService timer = new TimerService(30);
        QuizService quizService = new QuizService(quiz, timer);
        ResultService resultService = new ResultService();

        quizService.startQuiz(user);
        resultService.showResult(user);
    }
}
