package com.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 * 注解含义:将app的启动类当成一个可以自动化支持配置的bean,并且能够支持开启springboot自动化配置
 * spring自动化配置：开启spring bean需要声明xml，让spring自动扫描到
 * springboot自动化配置：所有依赖通通加入到工程当中，自动配置了redis ，aop等一系列依赖
 *
 * tomcat容器依赖需要换成jboss
 *
 * 之前controller 需要配置的selvert xml等一系列配置都不需要了
 * @author Administrator
 */
@EnableAutoConfiguration
@RestController
public class App 
{
    @RequestMapping("/")
    public String home(){
        return "Hello World";
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class,args);
    }
}
