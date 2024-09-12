package com.example.hi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hi {
    @GetMapping
    public String hi(){
        return "Allah";
    }
}
