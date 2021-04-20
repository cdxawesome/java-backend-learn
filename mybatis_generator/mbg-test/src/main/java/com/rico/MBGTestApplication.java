package com.rico;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rico.mapper")
public class MBGTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(MBGTestApplication.class, args);
    }
}
