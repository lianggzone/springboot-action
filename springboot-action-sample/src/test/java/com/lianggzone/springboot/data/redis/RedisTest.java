package com.lianggzone.springboot.data.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lianggzone.springboot.action.data.redis.dao.ValueRedisDao;
import com.lianggzone.springboot.main.WebMain;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(WebMain.class)
public class RedisTest {
	
    @Autowired
	private ValueRedisDao valueRedisDao;
    
	@Test
	public void test() throws Exception {
		this.valueRedisDao.save("LiangGzone");
		System.out.println(this.valueRedisDao.getParam());
	}
}