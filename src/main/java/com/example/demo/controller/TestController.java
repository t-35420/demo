package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Spring Boot Demo Project 環境初始化成功！";
    }
    
}
