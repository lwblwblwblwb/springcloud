package com.lwb.springcloud_order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudOrderApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringcloudOrderApplication.class, args);
	}

	@Bean //Bean注解用...?
	@LoadBalanced
	//SpringBoot 最重要的特点就是简化配置， 原来  <bean></bean>
	RestTemplate restTemplate(){
		return new RestTemplate();
	}


}
