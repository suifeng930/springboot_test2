package com.mhc.service.impl;

import com.mhc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Andre930
 * @create 2019-01-17 15:50
 */

@Service
public class UserserviceImpl implements IUserService {


    @Autowired
    private JdbcTemplate jdbcTemplate; //注入jdbc 模板



    @Override
    public void register(String username, String password) {

        String sql="insert user (username,password) values(?,?)";
        jdbcTemplate.update(sql,username,password);
    }
}
