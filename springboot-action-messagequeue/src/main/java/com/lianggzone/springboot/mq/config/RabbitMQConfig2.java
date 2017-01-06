package com.lianggzone.springboot.mq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lianggzone.springboot.mq.rabbitmq.exchange.Receiver;

@Configuration
public class RabbitMQConfig2 {
	
	public static final String QUEUE_NAME = "spring-boot";
	public static final String QUEUE_EXCHANGE_NAME = "spring-boot-exchange";
     
    @Bean
    public Queue queue() {
        // 是否持久化
        boolean durable = true; 
        // 仅创建者可以使用的私有队列，断开后自动删除
        boolean exclusive = false; 
        // 当所有消费客户端连接断开后，是否自动删除队列
        boolean autoDelete = false; 
        return new Queue(QUEUE_NAME, durable, exclusive, autoDelete);
    }
    
    @Bean
    public TopicExchange exchange() {
        // 是否持久化
        boolean durable = true;
        // 当所有消费客户端连接断开后，是否自动删除队列
        boolean autoDelete = false;
        return new TopicExchange(QUEUE_EXCHANGE_NAME, durable, autoDelete);
    }

    @Bean
    public Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(QUEUE_NAME);
    }
    
    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory,
            MessageListenerAdapter listenerAdapter) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.setQueueNames(QUEUE_NAME);
        container.setMessageListener(listenerAdapter);
        return container;
    }

    @Bean
    MessageListenerAdapter listenerAdapter(Receiver receiver) {
        return new MessageListenerAdapter(receiver, "receiveMessage");
    }
}