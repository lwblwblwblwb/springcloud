package com.lwb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

//OrderService注册成一个Bean
@Service
public class OrderService {
    //使用RestTemplate 的 getForObject方法调度 Member服务 ，
    // 然后我们在Service层注入一个RestTemplate实力
    @Autowired
    RestTemplate restTemplate;
    public List<String> getAllUserService(){
        //访问会员服务
        //Feign 方式
        return restTemplate.getForObject("http://service-member/getAllUsers",List.class);
    }
}
