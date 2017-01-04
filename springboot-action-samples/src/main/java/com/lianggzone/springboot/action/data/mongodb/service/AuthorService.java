package com.lianggzone.springboot.action.data.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lianggzone.springboot.action.data.mongodb.dao.AuthorDao;
import com.lianggzone.springboot.action.data.mongodb.entity.Author;


/**
 * <h3>概要:</h3><p>AuthorServiceImpl</p>
 * <h3>功能:</h3><p>AuthorServiceImpl</p>
 * <h3>履历:</h3>
 * <li>2016年12月13日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Service("mongodb.authorService")
public class AuthorService {
    
    @Autowired
    private AuthorDao authorDao;
    
    public void add(Author author) {
        this.authorDao.add(author);
    }
    
    public void update(Author author) {
        this.authorDao.update(author);      
    }
 
    public void delete(Long id) {
        this.authorDao.delete(id);
    }
 
    
    public Author findAuthor(Long id) {
        return this.authorDao.findAuthor(id);
    }
 
    
    public List<Author> findAuthorList() {
        return this.authorDao.findAuthorList();
    }
}