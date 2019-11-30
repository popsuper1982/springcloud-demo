package com.netease.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication
{
    /**
     * 注意：
     * 1.启动之后访问的地址是：http://localhost:8761/，不是http://localhost:8761/eureka。
     * 2.注意父pom.xml中spring-cloud-dependencies的版本，可能导致子工程中找不到对应版本。这里使用的版本Edgware.SR1是Ok的。
     * @param args
     */
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
