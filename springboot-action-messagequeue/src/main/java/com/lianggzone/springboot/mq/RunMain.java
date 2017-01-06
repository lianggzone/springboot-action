package com.lianggzone.springboot.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.lianggzone.springboot" })
public class RunMain {
    public static void main(String[] args) {
        SpringApplication.run(RunMain.class, args);
    }
}