package com.netease.cloud.demo.movie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class RibbonChooseConfiguration {
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new RandomRule();
    }
}
