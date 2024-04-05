package com.example.chatapp;

import com.example.chatapp.chat.ChatMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home()
    {
        return "Hello, Home!";
    }
    @GetMapping("/admin")
    public String admin()
    {
        return "Hello, Admin!";
    }
    @GetMapping("/save")
    public ChatMessage saveMessage(ChatMessage chatMessage)
    {
        // TODO - Implementation of saving the chat message in DB
        return chatMessage;
    }
}
