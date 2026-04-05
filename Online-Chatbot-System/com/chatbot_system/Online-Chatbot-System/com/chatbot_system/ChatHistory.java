package com.chatbot_system;

import java.util.ArrayList;

public class ChatHistory {

    ArrayList<String> history = new ArrayList<>();

    public void addMessage(String msg) {
        history.add(msg);
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No chat history.");
        } else {
            for (String m : history) {
                System.out.println(m);
            }
        }
    }
}
