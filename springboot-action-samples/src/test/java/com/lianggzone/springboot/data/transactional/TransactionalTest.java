package com.lianggzone.springboot.data.transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lianggzone.springboot.action.data.transactional.entity.Author;
import com.lianggzone.springboot.action.data.transactional.service.AuthorService;
import com.lianggzone.springboot.main.WebMain;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(WebMain.class)
public class TransactionalTest {
	
    @Autowired
	protected AuthorService authorService;
	
	//@Test
	public void add1() throws Exception {
		authorService.add1(new Author("梁桂钊", "梁桂钊"));
		authorService.add1(new Author("LiangGzone", "LiangGzone"));
	}
	
	//@Test
	public void add2() throws Exception {
		authorService.add2(new Author("梁桂钊", "梁桂钊"));
		authorService.add2(new Author("LiangGzone", "LiangGzone"));
	}
	
	@Test
	public void add3() throws Exception {
		authorService.add3(new Author("梁桂钊", "梁桂钊"));
		authorService.add3(new Author("LiangGzone", "LiangGzone"));
	}
}