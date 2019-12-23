package com.example.driverschool;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan( "com.example.driverSchool.mapper" )
@SpringBootApplication
public class DriverschoolApplication {

    public static void main(String[] args) {
        System.out.println("哈哈");
        SpringApplication.run(DriverschoolApplication.class, args);
    }

}
