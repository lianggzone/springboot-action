package com.lianggzone.springboot.action.core.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * <h3>概要:</h3><p>MsgServer</p>
 * <h3>功能:</h3><p>任务服务类</p>
 * <h3>履历:</h3>
 * <li>2017年01月05日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Service
public class MsgServer {

	@Async
	public void sendA() throws Exception {
		System.out.println("send A");
		Long startTime = System.currentTimeMillis();
		Thread.sleep(2000);
		Long endTime = System.currentTimeMillis();
		System.out.println("耗时：" + (endTime - startTime));
	}

	@Async
	public void sendB() throws Exception {
		System.out.println("send B");
		Long startTime = System.currentTimeMillis();
		Thread.sleep(2000);
		Long endTime = System.currentTimeMillis();
		System.out.println("耗时：" + (endTime - startTime));
	}
}