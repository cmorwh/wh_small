package com.cmorwh.sche;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by wangheng on 2020/8/19 11:15
 */
@SpringBootApplication
@EnableScheduling
@MapperScan("com.cmorwh.sche.mapper")
public class mallApplication {
    public static void main(String[] args) {
        SpringApplication.run(mallApplication.class,args);
    }
}
