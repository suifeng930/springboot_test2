package com.mhc.service.impl;

import com.mhc.mapper.UserMapper;
import com.mhc.model.User;
import com.mhc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Andre930
 * @create 2019-01-17 15:50
 */

@Service
@Transactional //配置事务处理
public class UserserviceImpl implements IUserService {


    @Autowired
    private JdbcTemplate jdbcTemplate; //注入jdbc 模板

    @Autowired
    private UserMapper userMapper;



    @Override
    public void register(String username, String password) {

//        String sql="insert user (username,password) values(?,?)";
//        jdbcTemplate.update(sql,username,password);

        userMapper.save(username,password);
    }

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }

}
