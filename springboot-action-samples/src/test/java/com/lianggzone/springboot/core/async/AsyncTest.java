package com.lianggzone.springboot.core.async;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lianggzone.springboot.action.core.async.MsgServer;
import com.lianggzone.springboot.main.WebMain;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WebMain.class)
public class AsyncTest {
	
	@Autowired
	private MsgServer msgServer;

	@Test
	public void test() throws Exception {
		msgServer.sendA();
		msgServer.sendB();
	}
}