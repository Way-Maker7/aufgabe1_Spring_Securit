package com.example.augabe1_spring_security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



    @RequestMapping("api/bonjour")
    @RestController
    public  class GreetingController {

        @GetMapping
        public String greetMe() {
            return "Hello Denis";
        }
    }

