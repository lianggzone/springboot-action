package com.lianggzone.springboot.cache.redis;

import java.sql.Timestamp;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
/**
 * <h3>概要:</h3><p>CacheService</p>
 * <h3>功能:</h3><p>RedisCache 缓存管理</p>
 * <h3>履历:</h3>
 * <li>2017年1月5日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Service("redis.cacheService")
public class CacheService {

    @CachePut(value = "rediscache")
    public long save() {
        long timestamp = new Timestamp(System.currentTimeMillis()).getTime();
        System.out.println("进行缓存：" + timestamp);
        return timestamp;
    }
 
    @CacheEvict(value = "rediscache")
    public void delete() {
        System.out.println("删除缓存");
    }
 
    @Cacheable(value = "rediscache")
    public long getByCache() {
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Timestamp(System.currentTimeMillis()).getTime();
    }

}