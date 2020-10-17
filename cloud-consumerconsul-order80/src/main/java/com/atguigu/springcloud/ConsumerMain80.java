package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Pikachu
 * 2020/10/14.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerMain80 {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerMain80.class,args);
	}
}
