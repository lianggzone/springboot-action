package com.lianggzone.springboot.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class RestfulApiWebDemo {
	
	@RequestMapping("/demo/hello")
	String home() {
		return "Hello World!";
	}

	/*public static void main(String[] args) throws Exception {
		SpringApplication.run(RestfulApiWebDemo.class, args);
	}*/
}