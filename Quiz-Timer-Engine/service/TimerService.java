package com.QuizEngine.service;

public class TimerService {

    private long startTime;
    private int timeLimit; // seconds

    public TimerService(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public boolean isTimeUp() {
        long current = System.currentTimeMillis();
        return (current - startTime) / 1000 > timeLimit;
    }
}
