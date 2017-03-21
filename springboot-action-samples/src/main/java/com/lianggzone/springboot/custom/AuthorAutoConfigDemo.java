package com.lianggzone.springboot.custom;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class AuthorAutoConfigDemo {
	
    /*@Resource
    private AuthorServer authorServer;
    
    @RequestMapping("/custom/author")
    String home() {
        return "发布者："+ authorServer.getAuthor();
    }*/
}