package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello world 8081 端口";
    }
}
