package com.lwb.springcloud_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringcloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigServerApplication.class, args);
	}


	测试
	http://localhost:8889/foo/dev
	{"name":"foo","profiles":["dev"],"label":null,"version":"7338900ff791e583d8523fbd3e37faee4f324868","state":null,"propertySources":[]}

}
