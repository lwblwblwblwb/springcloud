package com.lwb.springcloud_menber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class SpringcloudMenberApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudMenberApplication.class, args);
	}

}
