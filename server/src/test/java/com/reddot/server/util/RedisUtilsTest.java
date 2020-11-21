package com.reddot.server.util;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RedisUtilsTest {
    @Autowired
    RedisUtils redisUtils;

    @Test
    void geoGet() {
        System.out.println(redisUtils.geoGet("location1"));;
    }

    @Test
    void geoUpdate() {
        redisUtils.geoUpdate(111.11,11,"location1");
    }
}