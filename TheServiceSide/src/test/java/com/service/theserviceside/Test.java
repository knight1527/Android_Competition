package com.service.theserviceside;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author duanqihang
 * Created with IntelliJ IDEA.
 * User: suse_QiHang
 * Date: 2022/4/14 12:43
 * Description:
 */
@SpringBootTest
public class Test {
    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @org.junit.Test
    public void TestRedis(){
        redisTemplate.opsForValue().set("test", "dqh");
        System.out.println(redisTemplate.opsForValue().get("test"));
    }
}
