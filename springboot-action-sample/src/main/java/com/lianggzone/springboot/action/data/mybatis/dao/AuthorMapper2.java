package com.lianggzone.springboot.action.data.mybatis.dao;

import org.apache.ibatis.annotations.Param;

import com.lianggzone.springboot.action.data.mybatis.entity.Author;

/**
 * <h3>概要:</h3><p>AuthorMapper</p>
 * <h3>功能:</h3><p>AuthorMapper（通过XML配置文件的方式）</p>
 * <h3>履历:</h3>
 * <li>2016年12月13日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public interface AuthorMapper2 { 
    Author findAuthor(@Param("id") Long id); 
}