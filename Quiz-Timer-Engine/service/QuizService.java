package com.QuizEngine.service;

import com.QuizEngine.model.*;

import java.util.Scanner;

public class QuizService {

    private Quiz quiz;
    private TimerService timer;

    public QuizService(Quiz quiz, TimerService timer) {
        this.quiz = quiz;
        this.timer = timer;
    }

    public void startQuiz(User user) {
        Scanner sc = new Scanner(System.in);
        timer.start();

        for (Question q : quiz.getQuestions()) {

            if (timer.isTimeUp()) {
                System.out.println("⏰ Time's up!");
                break;
            }

            q.execute();
            System.out.print("Your Answer: ");
            String ans = sc.nextLine();

            if (q.checkAnswer(ans)) {
                user.incrementScore();
            }
        }
    }
}
