package com.git.demo.gitdemo.kishan.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/c3")
public class Controller3 {
    @GetMapping("/get")
    public String get()
    {
        System.out.println("Controller3");
        System.out.println("Kishan New Code");
        return "Controller3";
    }
}
