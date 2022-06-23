package com.git.demo.gitdemo.kishan.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/c1")
public class Controller1 {
    @GetMapping("/get")
    public String get()
    {
        System.out.println("Controller1");
        System.out.println("kishan");
        System.out.println("Contrbnhj ji jik jooller1");
        System.out.println("dhruv");
        System.out.println("***************************************************");
        return "Controller1";
    }

    @GetMapping("/getsd")
    public String gettst()
    {
        System.out.println("Controller dp");
        return "Controller dp";
    }
}
