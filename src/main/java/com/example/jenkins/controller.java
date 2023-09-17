package com.example.jenkins;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class controller {

    @GetMapping
    public String getUser(){
        return "Gomaa";
    }
}
