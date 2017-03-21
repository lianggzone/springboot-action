package com.lianggzone.springboot.action.data.transactional.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lianggzone.springboot.action.data.transactional.entity.Author;

/**
 * <h3>概要:</h3><p>AuthorDaoImpl</p>
 * <h3>功能:</h3><p>AuthorDaoImpl</p>
 * <h3>履历:</h3>
 * <li>2017年01月04日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Repository("transactional.authorDao")
public class AuthorDao  {
 
    @Autowired
    private JdbcTemplate jdbcTemplate;
 
    public int add(Author author) {
        return jdbcTemplate.update("insert into t_author(real_name, nick_name) values(?, ?)", 
                author.getRealName(), author.getNickName());
    }
 
}