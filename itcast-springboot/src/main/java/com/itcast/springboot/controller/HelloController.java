package com.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @Description: TODO
 * @ProjectName: demo
 * @Package: com.itcast.springboot.controller
 * @Author: HuangPeiDong
 * @CreateDate: 2020/3/22 19:29
 */
@RestController
@RequestMapping("hello")
@EnableAutoConfiguration //启动自动配置
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("show")
    public String test() {
        return "hello springboot 1";
    }

}
