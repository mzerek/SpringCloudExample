package com.mzerek.service.one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneRestController {

    @GetMapping("/helloOne")
    public String helloOne(){
        return "Hello from service One";
    }
}
