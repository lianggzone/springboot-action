package com.lianggzone.springboot.action.data.mongodb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.lianggzone.springboot.action.data.mongodb.entity.Author;

/**
 * <h3>概要:</h3><p>AuthorDao</p>
 * <h3>功能:</h3><p>AuthorDao</p>
 * <h3>履历:</h3>
 * <li>2016年12月13日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Repository("mongodb.authorDao")
public class AuthorDao {
    
    @Autowired
    private MongoTemplate mongoTemplate;
 
    public void add(Author author) {
        this.mongoTemplate.insert(author);
    }
 
    public void update(Author author) {
        this.mongoTemplate.save(author); 
    }
 
    public void delete(Long id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(id));
        this.mongoTemplate.remove(query, Author.class);
    }
 
    public Author findAuthor(Long id) {
        return this.mongoTemplate.findById(id, Author.class);
    }

    public List<Author> findAuthorList() {
        Query query = new Query();
        return this.mongoTemplate.find(query, Author.class);
    }
}