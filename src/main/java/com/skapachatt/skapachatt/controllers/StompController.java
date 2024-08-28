package com.skapachatt.skapachatt.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.skapachatt.skapachatt.models.Hello;
import com.skapachatt.skapachatt.models.HelloMessage;

@Controller
public class StompController {

    @MessageMapping("/hello")
    @SendTo("/topic/greeting")
    public Hello hello(HelloMessage message) {
        System.out.println("/Hello");
        return new Hello("Hej: " + message.getName() + "!");
    }
}
