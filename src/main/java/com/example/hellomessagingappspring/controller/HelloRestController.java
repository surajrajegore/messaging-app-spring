package com.example.hellomessagingappspring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hellomessage")
public class HelloRestController {
    @GetMapping(value = {"", "/", "/home"})
    public String sayHello(){
        return "Hello From Bridgelabz!";
    }

    @GetMapping("/query")
    public String queryParam(@RequestParam String name){
        return "Hello "+name+" From Bridgelabz";
    }

}
