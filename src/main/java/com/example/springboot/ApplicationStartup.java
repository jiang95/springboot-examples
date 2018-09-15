package com.example.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author: lingjun.jlj
 * @date: 2018/8/20 10:05
 * @description:
 */
@ServletComponentScan
@SpringBootApplication
@MapperScan("com.example.springboot.persist")
public class ApplicationStartup extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStartup.class, args);
    }
}
