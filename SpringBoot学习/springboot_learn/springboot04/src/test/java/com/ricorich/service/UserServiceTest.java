package com.ricorich.service;

import com.ricorich.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
//@RunWith(SpringRunner.class) //如果用的junit4，需要写这个注解，这里是junit5不用写
class UserServiceTest {

    @Autowired
    protected UserService userService;

    @Test
    void queryBtId() {
        User user = userService.queryBtId(8L);
        System.out.println("user:" + user);
    }

    @Test
    void saveUser() {
        User user = new User();
        user.setUserName("test2");
        user.setAge(18);
        user.setPassword("aaaaa");
        user.setName("dylan");
        user.setSex(2);
        user.setBirthday(new Date());
        user.setCreated(new Date());
        userService.saveUser(user);
    }
}