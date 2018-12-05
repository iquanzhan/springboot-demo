package com.chengxiaoxiao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

/**
 * @ClassName: HelloController
 * @description:
 * @author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2018-12-05
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    DataSource dataSource;


    @RequestMapping("/index")
    @ResponseBody
    public String index() {

        return "hello spring-boot" + dataSource;
    }
}
