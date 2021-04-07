package com.ricorich.controller;

import com.ricorich.pojo.User;
import com.ricorich.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RefreshScope // 刷新配置
public class UserController {

    // 这里是获取配置文件中设置的字段的值
    @Value("${test.name}")
    private String name;

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public User queryById(@PathVariable Long id) {
        System.out.println("配置文件中的test.name的值是:" + name);
        return userService.queryBtId(id);
    }
}
