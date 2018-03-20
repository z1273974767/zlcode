package com.example.servicehystrix2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //注册服务(消耗其他服务)
@EnableFeignClients  //feign支持客户端
public class ServiceHystrix2Application {

	public static void main(String[] args) {

		SpringApplication.run(ServiceHystrix2Application.class, args);
	}
}
