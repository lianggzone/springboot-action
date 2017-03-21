package com.lianggzone.springboot.action.data.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.lianggzone.springboot.action.data.jpa")
@EntityScan("com.lianggzone.springboot.action.data.jpa.entity")   
public class JPAConfig {}