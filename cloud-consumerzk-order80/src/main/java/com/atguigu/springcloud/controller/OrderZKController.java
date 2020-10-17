package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Pikachu
 * 2020/10/14.
 */
@RestController
@Slf4j
public class OrderZKController {

	public static final String INVOKE_URL = "http://cloud-provider-payment";

	@Resource
	private RestTemplate restTemplate;

	@GetMapping(value = "/consumer/payment/zk")
	public String pamentInfo(){
		String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
		return result;
	}
}
