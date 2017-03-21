package com.lianggzone.springboot.action.data.redis.dao;

import javax.annotation.Resource;

import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

@Repository
public class RedisBaseDao {

    @Resource(name="redisTemplate")
    protected ValueOperations<String, String> valueOperations;
    
    public void addValue(String key, String value){
        valueOperations.set(key, value);
    }
 
    public String getValue(String key){
        return valueOperations.get(key);
    }
}