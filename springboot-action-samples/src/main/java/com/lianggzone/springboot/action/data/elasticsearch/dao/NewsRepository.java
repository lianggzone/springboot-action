package com.lianggzone.springboot.action.data.elasticsearch.dao;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.lianggzone.springboot.action.data.elasticsearch.entity.News;

/**
 * <h3>概要:</h3><p>NewsRepository</p>
 * <h3>功能:</h3><p>NewsRepository</p>
 * <h3>履历:</h3>
 * <li>2016年12月14日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public interface NewsRepository extends ElasticsearchRepository<News, String> {
	public List<News> findByTitle(String title);
}
