package com.lianggzone.springboot.cache.concurrenmapcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h3>概要:</h3><p>CacheController</p>
 * <h3>功能:</h3><p>ConcurrentMapCache 缓存管理</p>
 * <h3>履历:</h3>
 * <li>2017年1月5日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@RestController("concurrenmapcache.cacheController")
@RequestMapping(value = "/concurrenmapcache/cache")
public class CacheController {
    @Autowired
    private CacheService cacheService;

    /**
     * 查询方法
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getByCache() {
        Long startTime = System.currentTimeMillis();
        long timestamp = this.cacheService.getByCache();
        Long endTime = System.currentTimeMillis();
        System.out.println("耗时: " + (endTime - startTime));
        return timestamp+"";
    }

    /**
     * 保存方法
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public void save() {
        this.cacheService.save();
    }

    /**
     * 删除方法
     */
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public void delete() {
        this.cacheService.delete();
    }
}