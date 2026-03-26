package com.example.chatbot.controller;

import com.example.chatbot.dto.MessageRequest;
import com.example.chatbot.dto.MessageResponse;
import com.example.chatbot.service.ChatbotService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    private static final Logger logger = LoggerFactory.getLogger(WebhookController.class);

    private final ChatbotService chatbotService;

    public WebhookController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }

    @PostMapping
    public MessageResponse receiveMessage(@Valid @RequestBody MessageRequest request) {
        logger.info("Incoming message received: {}", request.getMessage());

        String reply = chatbotService.getReply(request.getMessage());

        logger.info("Bot reply sent: {}", reply);

        return new MessageResponse(reply);
    }

    @GetMapping
    public String healthCheck() {
        return "Webhook API is running";
    }
}
