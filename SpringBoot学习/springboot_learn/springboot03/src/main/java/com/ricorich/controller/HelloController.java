package com.ricorich.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private DataSource dataSource;


    @RequestMapping("/sayHello")
    public String sayHello()
    {
        System.out.println("datasource:"+dataSource);
        return "Hello World.";
    }

}
