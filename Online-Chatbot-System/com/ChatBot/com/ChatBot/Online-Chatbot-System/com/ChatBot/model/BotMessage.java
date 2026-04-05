package com.ChatBot.model;

public class BotMessage extends Message {

    public BotMessage(String content) {
        super(content);
    }

    @Override
    public String format() {
        return "Bot: " + content;
    }
}
