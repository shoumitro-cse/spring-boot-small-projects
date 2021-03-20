package com.javatpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class SpringBootJdbcController {

    @Autowired
    JdbcTemplate jdbc;

//        http://localhost:8080/insert
    @RequestMapping("/insert")
    public String index() {
        jdbc.execute("insert into user(name,email)values('javatpoint','java@javatpoint.com')");
        return "data inserted Successfully";
    }

}
