package com.lianggzone.springboot.mq.rabbitmq.simple;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

//@Service
public class Receiver {
    
    @RabbitListener(queues = "spring-boot-simple")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }
}