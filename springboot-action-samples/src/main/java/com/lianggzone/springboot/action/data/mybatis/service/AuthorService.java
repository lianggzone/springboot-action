package com.lianggzone.springboot.action.data.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lianggzone.springboot.action.data.mybatis.dao.AuthorMapper;
import com.lianggzone.springboot.action.data.mybatis.entity.Author;

/**
 * <h3>概要:</h3><p>AuthorService</p>
 * <h3>功能:</h3><p>AuthorService（通过注解的方式）</p>
 * <h3>履历:</h3>
 * <li>2016年12月13日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Service("mybatis.authorService")
public class AuthorService {
    
    @Autowired
    private AuthorMapper authorMapper;
 
    public int add(String realName, String nickName) {
        return this.authorMapper.add(realName, nickName);
    }
 
    public int update(String realName, String nickName, Long id) {
        return this.authorMapper.update(realName, nickName, id);      
    }
 
    public int delete(Long id) {
        return this.authorMapper.delete(id);
    }
 
    public Author findAuthor(Long id) {
        return this.authorMapper.findAuthor(id);
    }
 
    public List<Author> findAuthorList() {
        return this.authorMapper.findAuthorList();
    }
}