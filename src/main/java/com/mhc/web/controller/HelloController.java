package com.mhc.web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一个springboot demo
 * @author Andre930
 * @create 2019-01-17 10:42
 */

@RestController //声明一个rest风格的控制器
//@EnableAutoConfiguration //自动配置 相当于写了 spring的配置文件
public class HelloController {


    @RequestMapping(value = "/hello/{name}")
    @ResponseBody //转成json
    public String helloWorld(@PathVariable String name){


        return "hello Spring Boot "+name;
    }

    public static void main(String[] args) {
        //启动springBoot的项目
        SpringApplication.run(HelloController.class,args);
    }
}
