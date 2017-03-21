package com.lianggzone.springboot.action.data.transactional.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lianggzone.springboot.action.data.transactional.dao.AuthorDao;
import com.lianggzone.springboot.action.data.transactional.entity.Author;


/**
 * <h3>概要:</h3><p>AuthorService</p>
 * <h3>功能:</h3><p>AuthorService</p>
 * <h3>履历:</h3>
 * <li>2017年01月04日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Service("transactional.authorService")
public class AuthorService {

	@Autowired
    private AuthorDao authorDao;
	
	public int add1(Author author) {
		int n = this.authorDao.add(author);	
		if(author.getRealName().length() > 5){
			throw new IllegalArgumentException("author real name is too long.");
		}
		return n;
	}
	
	@Transactional(noRollbackFor={IllegalArgumentException.class})
	public int add2(Author author) {
		int n = this.authorDao.add(author);	
		if(author.getRealName().length() > 5){
			throw new IllegalArgumentException("author real name is too long.");
		}
		return n;
	}
	
	@Transactional(rollbackFor={IllegalArgumentException.class})
	public int add3(Author author) {
		int n = this.authorDao.add(author);	
		if(author.getRealName().length() > 5){
			throw new IllegalArgumentException("author real name is too long.");
		}
		return n;
	}
}