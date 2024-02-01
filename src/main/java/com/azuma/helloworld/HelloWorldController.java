package com.azuma.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello World from Spring Boot";
    }

    @GetMapping("/other") // http://localhost:8080/other?person=rafael
    public String helloOthers(@RequestParam(name = "person") String other) {
        return "Hello World from " + other;
    }
}
