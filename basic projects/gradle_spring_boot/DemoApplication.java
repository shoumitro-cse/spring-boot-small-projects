package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.SimpleCommandLinePropertySource;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	
	    System.out.println("My Spring Boot Application started");
	    
		//SpringApplication app = new SpringApplication(DemoApplication.class);
			    
		//SimpleCommandLinePropertySource source = new SimpleCommandLinePropertySource(args);
		//if (!source.containsProperty("spring.profiles.active") &&
		//        !System.getenv().containsKey("SPRING_PROFILES_ACTIVE")) {
        //
		//    app.setAdditionalProfiles("production");
		//}
    
		SpringApplication.run(DemoApplication.class, args);
	}

}
