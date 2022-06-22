package com.git.demo.gitdemo.kishan.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/c2")
public class Controller2 {
    @GetMapping("/get")
    public String get()
    {
        System.out.println("Controller2");
        return "Controller2";
    }
}
