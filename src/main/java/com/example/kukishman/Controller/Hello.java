package com.example.kukishman.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/zdarova")
    public String index() {
        return "Zdarova!";
    }

}
