package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: tools-test
 * @description:
 * @author: yin zhi peng
 * @create: 2023-09-28 17:31
 */
@SpringBootApplication
@MapperScan("com.mapper")
public class AppServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppServiceApplication.class,args);
    }

}
