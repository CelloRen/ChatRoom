package com.csu.ChatRoom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MasterController {

    @RequestMapping("/")
    public String hello(){
        return "Welcome to start SpringBoot!";
    }
}