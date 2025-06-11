package com.grirzouhair.springapi.controller;


import com.grirzouhair.springapi.entities.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @RequestMapping("/greeting")
    public Message greeting() {
        return new Message("Zouhair");
    }
}
