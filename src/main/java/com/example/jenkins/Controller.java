package com.example.jenkins;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class Controller {

    @GetMapping
    public String getUser(){
        return "Gomaa get get";
    }

    @PostMapping
    public String postUser() {
        return "Mohamed gomaa posted";
    }
}
