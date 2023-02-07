package com.example.springapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringApiApplication.class, args);
    }
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello From BridgeLabz!!!";
    }
}
