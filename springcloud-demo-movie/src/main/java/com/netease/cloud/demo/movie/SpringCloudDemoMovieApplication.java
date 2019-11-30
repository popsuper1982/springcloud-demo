package com.netease.cloud.demo.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.netease.cloud.demo.movie.config.RibbonChooseConfiguration;

@EnableEurekaClient
@SpringBootApplication
//@RibbonClient(name = "springcloud-demo-user",configuration = RibbonChooseConfiguration.class)
public class SpringCloudDemoMovieApplication {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoMovieApplication.class, args);
    }
}
