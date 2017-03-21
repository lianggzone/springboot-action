package com.lianggzone.springboot.action.data.jpa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lianggzone.springboot.action.data.jpa.entity.Author;

/**
 * <h3>概要:</h3><p>AuthorDaoImpl</p>
 * <h3>功能:</h3><p>AuthorDaoImpl</p>
 * <h3>履历:</h3>
 * <li>2017年01月03日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Repository
public class AuthorDaoImpl implements AuthorDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Author> findAll() {
		return this.entityManager
				.createQuery("select t from Author t", Author.class)
				.getResultList();
	}
	
	@Override
	public Author findAuthor(Long id){
		return this.entityManager
				.createQuery("select t from Author t where id = ?", Author.class)
				.setParameter(1, id)
				.getSingleResult();
	}

}
