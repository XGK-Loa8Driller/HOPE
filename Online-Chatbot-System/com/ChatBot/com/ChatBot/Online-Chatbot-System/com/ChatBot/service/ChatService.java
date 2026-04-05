package com.ChatBot.service;

public class ChatService {

    public String getReply(String input) {

        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you?";
        }
        else if (input.contains("name")) {
            return "I am your chatbot 🤖";
        }
        else if (input.contains("how are you")) {
            return "I am doing great!";
        }
        else if (input.contains("bye")) {
            return "Goodbye!";
        }
        else {
            return "Sorry, I didn't understand.";
        }
    }
}
