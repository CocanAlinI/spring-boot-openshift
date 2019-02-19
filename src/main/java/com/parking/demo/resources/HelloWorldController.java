package com.parking.demo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping
    @RequestMapping("hello")
    public String getHelloWorld() {
        return "Hello world";
    }
}
