package com.reddot.server.service;

import com.reddot.server.dao.UserMapper;
import com.reddot.server.domain.ResponseWrapper;
import com.reddot.server.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Trey
 * @since 2020/11/20
 */

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public ResponseWrapper login(String username, String password) {
        if (!isExist(username))
            return new ResponseWrapper(500, "用户不存在");
        User user = userMapper.login(username, password);
        if (user.getPassword().equals(password)) {
            user.setPassword(null);
            return new ResponseWrapper(200, user);
        }
        return new ResponseWrapper(500, "密码输入错误");
    }

    public ResponseWrapper register(User user) {
        if (isExist(user.getUsername()))
            return new ResponseWrapper(500,"用户名已存在");
        if (userMapper.register(user)) {
            return new ResponseWrapper(200, "注册成功");
        }
        return new ResponseWrapper(500,"注册失败");
    }

    /**
     * 判断用户是否存在
     * @param username
     * @return boolean
     */
    private boolean isExist(String username) {
        return userMapper.isExist(username).size() != 0;
    }
}
