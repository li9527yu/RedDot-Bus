package com.reddot.server.util;

import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

/**
 * redis工具类
 *
 * @author Trey
 * @since 2020/11/21
 */

public class RedisUtils {

    @Resource
    RedisTemplate template;
}
