package com.netease.cloud.demo.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netease.cloud.demo.movie.entity.User;

@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    
    @GetMapping("/movie/{id}")
    public User findUserById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://springcloud-demo-user/sample/" + id, User.class);
    }
    
    @GetMapping(value = "/test")
    public String test() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("springcloud-demo-user");
        String userresult = "springcloud-demo-user\t"+serviceInstance.getServiceId()+"-->"+serviceInstance.getHost()+":"+serviceInstance.getPort();
        ServiceInstance serviceInstance2 = loadBalancerClient.choose("springcloud-demo-user2");
        String user2result = "springcloud-demo-user2\t"+serviceInstance2.getServiceId()+"-->"+serviceInstance2.getHost()+":"+serviceInstance2.getPort();
        return userresult+"\n"+user2result;
    }
}
