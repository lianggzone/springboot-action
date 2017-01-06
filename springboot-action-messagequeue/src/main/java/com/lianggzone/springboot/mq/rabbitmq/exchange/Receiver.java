package com.lianggzone.springboot.mq.rabbitmq.exchange;

import org.springframework.stereotype.Service;

@Service
public class Receiver {
    
    public void receiveMessage(String message) {
    	System.out.println("Received <" + message + ">");
    }
}