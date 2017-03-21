package com.lianggzone.springboot.action.data.elasticsearch.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lianggzone.springboot.action.data.elasticsearch.service.NewsService;

/**
 * <h3>概要:</h3><p>NewsController</p>
 * <h3>功能:</h3><p>NewsController</p>
 * <h3>履历:</h3>
 * <li>2016年12月14日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@RestController("es.newsController")
@RequestMapping(value="/data/elasticsearch/news")
public class NewsController {
    
    @Autowired
    private NewsService newsService;
    
    /**
     * 初始化
     * @param request
     */
    @RequestMapping(value = "/init", method = RequestMethod.POST)
    public void init(HttpServletRequest request) {
        this.newsService.init();
    }
    
    /**
     * findAll        
     * @param request
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Map<String, Object> findList(HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("items", this.newsService.findAll());
        return params;
    }
    
    /**
     * find      
     * @param request
     * @return
     */
    @RequestMapping(value = "/{title}", method = RequestMethod.GET)
    public Map<String, Object> search(@PathVariable String title) {
    	// 构建查询条件
    	QueryBuilder queryBuilder = QueryBuilders.queryString(title);
    	
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("items", this.newsService.search(queryBuilder));
        return params;
    }
}
