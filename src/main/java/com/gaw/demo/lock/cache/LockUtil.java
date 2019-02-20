package com.gaw.demo.lock.cache;

import org.springframework.data.redis.core.RedisTemplate;

/**
 * desc todo
 *
 * @author gaopo
 * @date 2018/11/30.
 */
public class LockUtil {

    private RedisTemplate<String,String> redisTemplate;

    public boolean lock(){
        redisTemplate.opsForValue().setIfAbsent("aghdsadsh","adghdfhadsh");
        return true;
    }
}
