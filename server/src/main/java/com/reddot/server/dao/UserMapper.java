package com.reddot.server.dao;

import com.reddot.server.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Trey
 * @since 2020/11/19
 */

@Mapper
public interface UserMapper {

    @Select("SELECT id,username,password FROM `user` WHERE `username`=#{username}")
    User login(String username, String password);

    @Insert("INSERT INTO `user` (username,password,type) VALUES (#{username},#{password},#{type})")
    boolean register(User user);

    @Select("SELECT id FROM `user` WHERE `username`=#{username}")
    List<User> isExist(String username);
}
