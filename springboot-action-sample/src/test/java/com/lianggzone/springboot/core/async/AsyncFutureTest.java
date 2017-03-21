package com.lianggzone.springboot.core.async;

import java.util.concurrent.Future;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lianggzone.springboot.action.core.async.MsgFutureServer;
import com.lianggzone.springboot.main.WebMain;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WebMain.class)
public class AsyncFutureTest {
	
	@Autowired
	private MsgFutureServer msgFutureServer;

	@Test
	public void test() throws Exception {
		long startTime = System.currentTimeMillis();
		
		Future<String> task1 = msgFutureServer.sendA();
		Future<String> task2 = msgFutureServer.sendB();
		
		while(true) {
			if(task1.isDone() && task2.isDone() ) {
				break;
			}
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("总耗时：" + (endTime - startTime));
	}
}