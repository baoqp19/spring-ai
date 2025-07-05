package com.baohandsome.spring_ai.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.baohandsome.spring_ai.dto.ChatRequest;
import com.baohandsome.spring_ai.service.ChatService;

@RestController
public class ChatController {
    private ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/chat")
    public String Chat(@RequestBody ChatRequest request) {
        return chatService.chat(request);
    }
}
