package com.dnp.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = {
//        "com.dnp.test.config",
//        "com.dnp.test.controller",
//        "com.dnp.test.service"})
public class BaomidouTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaomidouTestApplication.class, args);
    }
}
