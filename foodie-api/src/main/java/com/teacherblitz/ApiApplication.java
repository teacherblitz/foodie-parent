package com.teacherblitz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * api程序入口
 * @author teacherblitz
 * @since 2020/4/25
 */
@MapperScan(basePackages = "com.teacherblitz.mapper")
@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
