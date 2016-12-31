package com.lianggzone.springboot.action.data.jdbc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lianggzone.springboot.action.data.jdbc.dao.AuthorDao;
import com.lianggzone.springboot.action.data.jdbc.entity.Author;
import com.lianggzone.springboot.action.data.jdbc.service.AuthorService;

/**
 * <h3>概要:</h3><p>AuthorServiceImpl</p>
 * <h3>功能:</h3><p>AuthorServiceImpl</p>
 * <h3>履历:</h3>
 * <li>2016年12月13日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Service("jdbc.AuthorService")
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorDao authorDao;
 
    @Override
    public int add(Author author) {
        return this.authorDao.add(author);
    }
 
    @Override
    public int update(Author author) {
        return this.authorDao.update(author);      
    }
 
    @Override
    public int delete(Long id) {
        return this.authorDao.delete(id);
    }
 
    @Override
    public Author findAuthor(Long id) {
        return this.authorDao.findAuthor(id);
    }
 
    @Override
    public List<Author> findAuthorList() {
        return this.authorDao.findAuthorList();
    }
}