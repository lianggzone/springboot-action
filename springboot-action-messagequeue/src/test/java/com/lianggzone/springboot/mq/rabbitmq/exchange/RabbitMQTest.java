package com.lianggzone.springboot.mq.rabbitmq.exchange;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lianggzone.springboot.mq.RunMain;
import com.lianggzone.springboot.mq.rabbitmq.exchange.Sender;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RunMain.class)
public class RabbitMQTest {
    
	@Autowired
	private Sender sender;

	@Test
	public void send() throws Exception {
		sender.send();
	}
}