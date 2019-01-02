package com.cau.demo.init;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.annotation.Resource;

/**
 * desc jedis配置
 *
 * @author gaopo
 * @date 2018/12/8.
 */
@Configuration
public class JedisConfig {

    //自动注入redis配置属性文件
    @Resource
    private RedisProperties properties;

    @Bean
    public JedisPool getJedisPool() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(properties.getJedis().getPool().getMaxIdle());
        config.setMaxTotal(properties.getJedis().getPool().getMaxActive());
        config.setMaxWaitMillis(properties.getJedis().getPool().getMaxWait().toMillis());
        return new JedisPool(config, properties.getHost(), properties.getPort(), 100);
    }

}
