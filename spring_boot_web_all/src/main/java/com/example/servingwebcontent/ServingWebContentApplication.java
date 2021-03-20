package com.example.servingwebcontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// for jar file
@SpringBootApplication
public class ServingWebContentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServingWebContentApplication.class, args);
    }

}

//package com.example.servingwebcontent;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//
//
////for war file
//@SpringBootApplication
//public class ServingWebContentApplication extends SpringBootServletInitializer {
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(ServingWebContentApplication.class);
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(ServingWebContentApplication.class, args);
//    }
//
//}


//cd /home/shoumitro/Documents/html_ex/Spring Boot Project/gradle_web; 
//JAVA_HOME=/home/shoumitro/jdk1.8.0_171 
//mvn "-Dexec.args=-classpath %classpath com.example.servingwebcontent.ServingWebContentApplication" -Dexec.executable=/home/shoumitro/jdk1.8.0_171/bin/java -Dexec.classpathScope=runtime org.codehaus.mojo:exec-maven-plugin:1.2.1:exec

