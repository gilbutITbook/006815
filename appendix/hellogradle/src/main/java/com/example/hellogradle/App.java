package com.example.hellogradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App {
    @RequestMapping("/")
    String hello(@RequestParam(defaultValue="Gradle") String name) {
        return String.format("Hello %1$s!", name);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
