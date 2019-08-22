package com.example.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 基本环境搭建
*
* 1.导入数据库文件，创建出department和employee表
* 2.创建JavaBean封装数据
* 3.整合MyBatis操作数据库
*   1.配置数据源信息（在application.yml文件中配置相应的信息数据）
*   2.使用注解版的MyBatis进行数据库的操作：
*       1.@MapperScan进行mapper包的扫描
*
* */
@MapperScan("com.example.cache.mapper")
@SpringBootApplication
public class SpringbootCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCacheApplication.class, args);
    }

}
