package com.lianggzone.springboot.action.data.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lianggzone.springboot.action.data.jpa.entity.Author;

/**
 * <h3>概要:</h3><p>AuthorRepository</p>
 * <h3>功能:</h3><p>AuthorRepository</p>
 * <h3>履历:</h3>
 * <li>2017年01月03日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public interface AuthorRepository extends JpaRepository<Author, Long> {
	
	List<Author> findAll();
	
	@Query("from Author where id = :id")
	Author findAuthor(@Param("id") Long id);
}
