package com.example.EsercizioInterceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequestMapping("/time")
@RestController
public class BasicController {
    @GetMapping("/test")
    public LocalDateTime basicController(){
        return LocalDateTime.now();
    }

}
