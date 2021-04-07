package com.ricorich.client;

import com.ricorich.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// 声明当前类是一个Feign客户端，指定服务名为user-service
@FeignClient("user-service")
public interface UserClient {
    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id);
}
