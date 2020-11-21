package com.reddot.server.util;

import org.springframework.data.geo.Point;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * redis工具类
 *
 * @author Trey
 * @since 2020/11/21
 */

@Component
public class RedisUtils {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    public void geoUpdate(double x, double y, String location) {
        redisTemplate.opsForGeo().add("geo", new Point(x, y), location);
    }

    public Point geoGet(String location) {
        List<Point> geo = redisTemplate.opsForGeo().position("geo", location);
        assert geo != null;
        return geo.get(0);
    }
}
