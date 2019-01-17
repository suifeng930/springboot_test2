package com.mhc.service;

import com.mhc.model.User;

import java.util.PrimitiveIterator;

/**
 * 用户service
 * @author Andre930
 * @create 2019-01-17 15:47
 */
public interface IUserService {


    /**
     * 用户注册
     * @param username  用户名
     * @param password  密码
     */
    public void register (String username,String password);

    /**
     * 通过用户名查找用户
     * @param username 用户名
     * @return vo
     */
    public User findByUsername(String username);

}
