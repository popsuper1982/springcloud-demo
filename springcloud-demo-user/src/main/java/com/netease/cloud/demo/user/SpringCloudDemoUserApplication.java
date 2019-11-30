package com.netease.cloud.demo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudDemoUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoUserApplication.class, args);
    }
}
