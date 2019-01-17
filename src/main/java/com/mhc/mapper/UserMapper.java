package com.mhc.mapper;

import com.mhc.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Andre930
 * @create 2019-01-17 16:09
 */
public interface UserMapper {

//    @Insert("insert user (username,password) values(#{username},#{password})")
//    public int save(@Param("username") String username, @Param("password") String password);
//
//    @Select("select * from where username=#{username}")
//    public User selectUsername(@Param("username") String username);

    public int save(String username,  String password);

    public User findByUsername( String username);

}