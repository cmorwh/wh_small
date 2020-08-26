package com.mypackage.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * Created on 2020/8/24 16:05 with IDEA
 * author: wh
 * Description:
 */
public class JedisTest {

    @Test
    public void testJedis(){

        Jedis jedis = new Jedis("172.28.50.78",6379);
        String result = jedis.ping();
        System.out.println("result: " + result );
    }
}
