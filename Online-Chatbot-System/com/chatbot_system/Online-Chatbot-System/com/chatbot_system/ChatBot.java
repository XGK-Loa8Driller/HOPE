package com.chatbot_system;

public class ChatBot {

    public String getReply(String userInput) {

        userInput = userInput.toLowerCase();

        if (userInput.contains("hello") || userInput.contains("hi")) {
            return "Hello! How can I help you?";
        }
        else if (userInput.contains("name")) {
            return "I am your chatbot 🤖";
        }
        else if (userInput.contains("how are you")) {
            return "I am doing great!";
        }
        else if (userInput.contains("bye")) {
            return "Goodbye!";
        }
        else {
            return "Sorry, I didn't understand.";
        }
    }
}
