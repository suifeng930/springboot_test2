package com.mhc.web.controller;

import com.mhc.model.User;
import com.mhc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

/**
 * 第一个springboot demo
 * @author Andre930
 * @create 2019-01-17 10:42
 */

@RestController //声明一个rest风格的控制器
//@EnableAutoConfiguration //自动配置 相当于写了 spring的配置文件
@RequestMapping(value = "/user")
public class UserController {


    @RequestMapping(value = "{id}")
    @ResponseBody //转成json
    /**
     * 通过id 查询用户的信息
     */
    public User userInfo(@PathVariable Integer id){

        User user=new User("小马","123");
        user.setId(id);
        int i=10/0; //运行时异常

        return user;

    }

    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/register")
    @ResponseBody
    public String register(String username,String password){

        userService.register(username,password);
        return "success";

    }

    public static void main(String[] args) {
        //启动springBoot的项目
        SpringApplication.run(UserController.class,args);
    }
}
