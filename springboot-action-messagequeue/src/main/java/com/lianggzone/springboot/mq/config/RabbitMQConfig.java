package com.lianggzone.springboot.mq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

//@Configuration
public class RabbitMQConfig {
	
	public static final String QUEUE_NAME = "spring-boot-simple";

    @Bean
    public Queue queue() {
        return new Queue(QUEUE_NAME);
    }
}