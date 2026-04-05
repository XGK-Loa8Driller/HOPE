package com.ChatBot.model;

public class UserMessage extends Message {

    public UserMessage(String content) {
        super(content);
    }

    @Override
    public String format() {
        return "You: " + content;
    }
}
