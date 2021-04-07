package com.ricorich.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.ricorich.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
@DefaultProperties(defaultFallback = "defaultFallback")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/{id}")
    @HystrixCommand
    public String queryById(@PathVariable Long id) {

//        // 获取eureka中注册的user-service实例
//        List<ServiceInstance> userService = discoveryClient.getInstances("user-service");
//        // 因为名称为user-service的应用我们只设置了一个，所有直接去列表的第一个
//        ServiceInstance serviceInstance = userService.get(0);
//        // 拼接url字符串
//        String url = "http://" + serviceInstance.getHost() + ":"
//                + serviceInstance.getPort() + "/user/findAll/" + id;
        String url = "http://user-service/user/" + id;
        return restTemplate.getForObject(url, String.class);
    }

//    public String queryByIdFallback(Long id) {
//        return "网络繁忙，访问失败!";
//    }

    public String defaultFallback() {
        return "对不起，网络繁忙，访问失败!";
    }
}
