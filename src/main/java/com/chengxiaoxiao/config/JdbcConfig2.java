package com.chengxiaoxiao.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @ClassName: JdbcConfig
 * @description: 2.0 SpringBoot的注解配置
 * @author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2018-12-05
 */
@Configuration
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig2 {

    @Bean
    public DataSource getDataSource(JdbcProperties jdbc) {
        DruidDataSource ds = new DruidDataSource();
        ds.setUrl(jdbc.getUrl());
        ds.setDriverClassName(jdbc.getDriverClassName());
        ds.setUsername(jdbc.getUsername());
        ds.setPassword(jdbc.getPassword());
        return ds;
    }

}
