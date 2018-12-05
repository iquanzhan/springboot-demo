package com.chengxiaoxiao.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @ClassName: JdbcConfig3
 * @description: 3.0 如果一个Class只有一个bean需要返回，可以直接指定在类上
 * @author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2018-12-05
 */
@Configuration
public class JdbcConfig3 {

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource getDataSource() {
        DruidDataSource ds = new DruidDataSource();
        return ds;
    }

}
