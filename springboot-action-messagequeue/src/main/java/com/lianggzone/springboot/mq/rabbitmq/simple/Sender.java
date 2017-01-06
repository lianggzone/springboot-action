package com.lianggzone.springboot.mq.rabbitmq.simple;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.lianggzone.springboot.mq.config.RabbitMQConfig;

//@Service
public class Sender {
	
    @Autowired
    private AmqpTemplate rabbitTemplate;
    
    public void send() {
    	System.out.println("梁桂钊 发送消息...");
        rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE_NAME, "你好， 梁桂钊!");
    }
    
}