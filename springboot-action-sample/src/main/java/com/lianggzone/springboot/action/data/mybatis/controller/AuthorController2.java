package com.lianggzone.springboot.action.data.mybatis.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lianggzone.springboot.action.data.mybatis.entity.Author;
import com.lianggzone.springboot.action.data.mybatis.service.AuthorService2;

/**
 * <h3>概要:</h3><p>AuthorController</p>
 * <h3>功能:</h3><p>AuthorController（通过XML配置文件的方式）</p>
 * <h3>履历:</h3>
 * <li>2016年12月13日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
// @RestController("mybatis.authorController2")
// @RequestMapping(value="/data/mybatis/author2")
// @MapperScan("com.lianggzone.springboot.action.data.mybatis.dao")
public class AuthorController2 {

    @Autowired
    private AuthorService2 authorService;

    /**
     * 查询用户信息
     */
    @RequestMapping(value = "/{userId:\\d+}", method = RequestMethod.GET)
    public Author getAuthor(@PathVariable Long userId, HttpServletRequest request) {
        Author author = this.authorService.findAuthor(userId);
        if (author == null) {
            throw new RuntimeException("查询错误");
        }
        return author;
    }

}