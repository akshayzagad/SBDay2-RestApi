package com.example.springapi;

import com.example.springapi.Pojo.Properties;
import org.springframework.web.bind.annotation.*;

@RestController
    public class HelloRestController {
        @GetMapping("/hello")
        public String sayHello() {
            return "Hello From BridgeLabz!!!";
        }

        @GetMapping("/query")
        public String sayHello(@RequestParam(value = "name") String name) {
            return "Hello " + name + "!";
        }

        @GetMapping("/param/{name}")
        public String sayHelloParam(@PathVariable String name) {
            return "Hello " + name + "!";
        }

        @PostMapping("/post")
        public String sayHello(@RequestBody Properties properties) {
            return "Hello " + properties.getFirstName() + " " + properties.getLastName() + "!";
        }
    @PutMapping("/put/{firstName}") //PUT http://localhost:8080/put/Akshay?lastName=Zagade
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }
    }

