package com.af.coffeshop.web.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    public static final String GREETINGS_FROM_SPRING_BOOT = "Greetings from Spring Boot!";

    @RequestMapping("/")
    public String index() {
        return GREETINGS_FROM_SPRING_BOOT;
    }

}
