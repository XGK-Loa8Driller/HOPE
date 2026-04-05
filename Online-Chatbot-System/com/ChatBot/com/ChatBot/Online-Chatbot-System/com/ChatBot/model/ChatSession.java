package com.ChatBot.model;

import java.util.ArrayList;

public class ChatSession {

    private ArrayList<Message> messages = new ArrayList<>();

    public void addMessage(Message msg) {
        messages.add(msg);
    }

    public void showChat() {
        if (messages.isEmpty()) {
            System.out.println("No chat history.");
        } else {
            for (Message m : messages) {
                System.out.println(m.format());
            }
        }
    }
}
