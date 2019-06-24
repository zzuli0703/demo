package com.example.demo.redisTest;

import org.springframework.beans.factory.InitializingBean;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author 640804
 * @ClassName: redis
 * @projectName demo
 * @description: TODO
 * @date 2019/6/22 17:36
 **/
public class redis implements InitializingBean {

    static JedisPool pool;

    public static void main(String[] args) {
        Jedis jedis = new Jedis("redis://localhost:6379/10");
        jedis.flushDB();

        jedis.set("hello", "world");
        System.out.println(jedis.get("hello"));
        sadd("hi", "hello world");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //pool = new JedisPool("redis://localhost:6379/10");
    }

    public static long sadd(String key, String value) {
        pool = new JedisPool("redis://localhost:6379/10");
        Jedis jedis = null;
        try {
            jedis = pool.getResource();
            return jedis.sadd(key, value);
        } catch (Exception e) {
            e.getMessage();
        } finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return 0;
    }
}
