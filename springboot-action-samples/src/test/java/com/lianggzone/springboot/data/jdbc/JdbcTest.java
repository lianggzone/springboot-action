package com.lianggzone.springboot.data.jdbc;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lianggzone.springboot.main.WebMain;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(WebMain.class)
public class JdbcTest {
	
    @Resource(name="oneJdbcTemplate")
	protected JdbcTemplate jdbcTemplate1;
    @Resource(name="twoJdbcTemplate")
	protected JdbcTemplate jdbcTemplate2;
	
	@Test
	public void test() throws Exception {
		jdbcTemplate1.update("insert into t_author(id, real_name, nick_name) values(?, ?, ?)", 2, "梁桂钊", "LiangGzone");
		jdbcTemplate2.update("insert into t_author(id, real_name, nick_name) values(?, ?, ?)", 2, "梁桂钊", "LiangGzone");
	}
}