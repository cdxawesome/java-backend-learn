package com.rico.swaggeruitest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api(tags = "MyController", description = "测试用的Controller")
public class MyController {

    @ApiImplicitParam(name = "name", value = "姓名", required = true)
    @ApiOperation("欢迎语句")
    @GetMapping("/hello")
    public String sayHello(@RequestParam("name") String name) {
        return name + ",hello Swagger-ui";
    }
}
