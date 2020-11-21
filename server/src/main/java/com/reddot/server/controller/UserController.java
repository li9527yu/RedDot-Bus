package com.reddot.server.controller;

import com.reddot.server.domain.ResponseWrapper;
import com.reddot.server.domain.User;
import com.reddot.server.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Trey
 * @since 2020/11/20
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService service;

    @PostMapping("/login")
    public ResponseWrapper login(@RequestBody User user) {
        return service.login(user.getUsername(), user.getPassword());
    }

    @PostMapping("/register")
    public ResponseWrapper register(@RequestBody User user) {
        return service.register(user);
    }
    @GetMapping("test")
    public String name() {
        return "hhhh";
    }
}
