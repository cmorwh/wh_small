package com.cmorwh.sche.service.impl;

import com.cmorwh.sche.service.RedisService;
import com.sun.xml.internal.ws.resources.UtilMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created on 2020/8/24 11:46 with IDEA
 * author: wh
 * Description:
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Override
    public void set(String key, String value,long time) {
        redisTemplate.opsForValue().set(key,value,time,TimeUnit.SECONDS);
    }


    @Override
    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public boolean expire(String key, long expire) {
        return redisTemplate.expire(key,expire, TimeUnit.MILLISECONDS);
    }

    @Override
    public void remove(String key) {
         redisTemplate.delete(key);
    }

    @Override
    public Long increment(String key, long delta) {
        return redisTemplate.opsForValue().increment(key,delta);
    }
}
