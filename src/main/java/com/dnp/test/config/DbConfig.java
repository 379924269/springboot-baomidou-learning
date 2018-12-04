package com.dnp.test.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * 自定义数据库参数配置
 * Created by huazai on 2018/12/4.
 */
@Component
public class DbConfig {
    @Value("${dnp.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${dnp.datasource.url}")
    private String url;

    @Value("${dnp.datasource.username}")
    private String username;

    @Value("${dnp.datasource.password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(this.url);
        druidDataSource.setUsername(this.username);
        druidDataSource.setPassword(this.password);
        druidDataSource.setDriverClassName(this.driverClassName);
        return druidDataSource;
    }
}
