package com.ricorich.controller;

import com.ricorich.pojo.User;
import com.ricorich.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id) {
        return userService.queryBtId(id);
    }



    @RequestMapping("/sayHello")
    public String sayHello() {
        System.out.println("datasource:" + dataSource);
        return "Hello World.";
    }

}
