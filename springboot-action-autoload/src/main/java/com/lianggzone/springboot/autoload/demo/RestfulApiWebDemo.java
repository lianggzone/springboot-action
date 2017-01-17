package com.lianggzone.springboot.autoload.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class RestfulApiWebDemo {
	
	@RequestMapping("/home")
	String home() {
		return "Hello World!!!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RestfulApiWebDemo.class, args);
	}
}