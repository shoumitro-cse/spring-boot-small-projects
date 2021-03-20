package com.example.gradle_spring_boot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    // http://localhost:8080/
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
