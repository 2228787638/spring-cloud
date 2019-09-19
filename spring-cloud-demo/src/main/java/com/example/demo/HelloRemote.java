package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name= "eureka-provider")
public interface HelloRemote {
    @RequestMapping(value = "/home")
    public String home();
}
