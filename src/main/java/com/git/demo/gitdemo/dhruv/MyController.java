package com.git.demo.gitdemo.dhruv;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/test")
    public String get()
    {
        System.out.println("new Controller");
        return "new Controller";
    }
}
