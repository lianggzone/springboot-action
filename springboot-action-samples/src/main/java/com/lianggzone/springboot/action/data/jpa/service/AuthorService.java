package com.lianggzone.springboot.action.data.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lianggzone.springboot.action.data.jpa.entity.Author;
import com.lianggzone.springboot.action.data.jpa.repository.AuthorRepository;

/**
 * <h3>概要:</h3><p>AuthorService</p>
 * <h3>功能:</h3><p>AuthorService</p>
 * <h3>履历:</h3>
 * <li>2016年12月14日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Service("jpa.authorService")
public class AuthorService {
	
    @Autowired
    private AuthorRepository authorRepository;
    
    public List<Author> findAll() {
		return this.authorRepository.findAll();
	}
    
    public Author findAuthor(Long id){
    	return this.authorRepository.findAuthor(id);
	}
}