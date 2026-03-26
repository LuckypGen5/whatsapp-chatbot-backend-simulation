package com.example.chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatbotService {

    public String getReply(String userMessage) {
        if (userMessage == null) {
            return "Sorry, I can only respond to simple messages right now.";
        }

        String message = userMessage.trim().toLowerCase();

        switch (message) {
            case "hi":
                return "Hello";
            case "bye":
                return "Goodbye";
            default:
                return "Sorry, I can only respond to simple messages right now.";
        }
    }
}
