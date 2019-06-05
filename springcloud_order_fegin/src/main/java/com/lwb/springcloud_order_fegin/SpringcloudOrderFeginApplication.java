package com.lwb.springcloud_order_fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//开启Feign客户端

@EnableFeignClients
public class SpringcloudOrderFeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudOrderFeginApplication.class, args);
	}

}
