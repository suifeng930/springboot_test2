package com.mhc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * spring boot 启动器
 * Hello world!
 *
 */

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.mhc") //配置通用扫描包
public class App 
{
    public static void main( String[] args )
    {
        //启动springboot项目
        SpringApplication.run(App.class,args);

        System.out.println( "Hello World!" );
    }
}
