package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Pikachu
 * 2020/10/16.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardMain9001.class,args);
	}
}
