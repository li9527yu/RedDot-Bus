package com.reddot.server.service;

import com.reddot.server.dao.UserMapper;
import com.reddot.server.domain.ResponseWrapper;
import com.reddot.server.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

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
        List<User> users = userMapper.getUsersByUsername(username);
        if (users.size() != 1)
            return new ResponseWrapper(500, "用户不存在");
        User user = users.get(0);
        user.setSalt("");
        if (user.getPassword().equals(password)) {
            user.setPassword(null);
            return new ResponseWrapper(200, user);
        }
        return new ResponseWrapper(500, "密码输入错误");
    }

    public ResponseWrapper register(User user) {
        List<User> users = userMapper.getUsersByUsername(user.getUsername());
        if (users.size() != 0)
            return new ResponseWrapper(500,"用户名已存在");
        if (userMapper.register(user)) {
            return new ResponseWrapper(200, "注册成功");
        }
        return new ResponseWrapper(500,"注册失败");
    }

}
