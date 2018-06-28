package com.example.bbd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dao.user.mapper")
public class BbdApplication {

    public static void main(String[] args) {
        SpringApplication.run(BbdApplication.class, args);
    }
}
