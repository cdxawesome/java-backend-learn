package com.ricorich;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
// 注意这个注解要用刚才导入的通用Mapper的那个包下,并且指定要扫描的包路径
@MapperScan(basePackages = "com.ricorich.mapper")
public class Springboot04Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot04Application.class, args);
    }

}
