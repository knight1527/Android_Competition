package com.service.theserviceside.service.impl;

import com.service.theserviceside.service.TestRedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author duanqihang
 * Created with IntelliJ IDEA.
 * User: suse_QiHang
 * Date: 2022/4/14 13:23
 * Description:
 */
@Service
public class TestRedisServiceImpl implements TestRedisService {

    @Resource
    private RedisTemplate redisTemplate;

    @Override
    public void testRedis() {
        redisTemplate.opsForValue().set("test", "dqh");
        System.out.println(redisTemplate.opsForValue().get("test"));
    }
}
