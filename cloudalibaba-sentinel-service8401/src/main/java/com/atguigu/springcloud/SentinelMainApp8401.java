package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Pikachu
 * 2020/10/19.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelMainApp8401
{
	public static void main(String[] args) {
		SpringApplication.run(SentinelMainApp8401.class, args);
	}
}
