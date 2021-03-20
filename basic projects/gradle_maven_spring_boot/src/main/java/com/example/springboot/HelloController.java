package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

// http://localhost:8080/

//@RestController
@Controller  
public class HelloController {

//    @RequestMapping("/home")
    @GetMapping("/home")
    public String index() {
//        return "Greetings from Spring Boot!";
        return "home";
    }

}
