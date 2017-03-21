package com.lianggzone.springboot.action.data.jdbc.dao;

import java.util.List;

import com.lianggzone.springboot.action.data.jdbc.entity.Author;

/**
 * <h3>概要:</h3><p>AuthorDao</p>
 * <h3>功能:</h3><p>AuthorDao</p>
 * <h3>履历:</h3>
 * <li>2016年12月13日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public interface AuthorDao {
    int add(Author author);
    int update(Author author);
    int delete(Long id);
    Author findAuthor(Long id);
    List<Author> findAuthorList();
}