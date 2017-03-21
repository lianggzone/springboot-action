package com.lianggzone.springboot.action.data.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lianggzone.springboot.action.data.mybatis.dao.AuthorMapper2;
import com.lianggzone.springboot.action.data.mybatis.entity.Author;

/**
 * <h3>概要:</h3><p>AuthorService</p>
 * <h3>功能:</h3><p>AuthorService（通过XML配置文件的方式）</p>
 * <h3>履历:</h3>
 * <li>2016年12月13日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Service("mybatis.authorService2")
public class AuthorService2 {
    
    @Autowired
    private AuthorMapper2 authorMapper;
 
    public Author findAuthor(Long id) {
        return this.authorMapper.findAuthor(id);
    }
 
}