package com.lianggzone.springboot.action.data.elasticsearch.service;

import java.util.Date;
import java.util.List;

import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lianggzone.springboot.action.data.elasticsearch.dao.NewsRepository;
import com.lianggzone.springboot.action.data.elasticsearch.entity.News;

/**
 * <h3>概要:</h3><p>NewsService</p>
 * <h3>功能:</h3><p>NewsService</p>
 * <h3>履历:</h3>
 * <li>2016年12月14日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Service
public class NewsService {
	
    @Autowired
    private NewsRepository newsRepository;
    
    public Iterable<News> findAll(){
        return newsRepository.findAll();
    }
    
    public Iterable<News> search(QueryBuilder query){
        return newsRepository.search(query);
    }
    
    public List <News> findByTitle(String title) {
    	return this.newsRepository.findByTitle(title);
    }
    
    public void deleteAll(String id){
        this.newsRepository.delete(id);
    }
    
    public void init(){
        for (int i = 0; i < 100; i++) {
        	News news = new News();
            news.setId(i+"");
            news.setTitle(i + ".梁桂钊单元测试用例");
            news.setContent("梁桂钊单元测试用例"+i+"xxxxx");
            news.setCreatedDateTime(new Date());
            this.newsRepository.save(news);
        }
    }
}