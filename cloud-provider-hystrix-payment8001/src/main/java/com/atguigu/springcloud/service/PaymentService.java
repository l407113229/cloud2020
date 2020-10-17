package com.atguigu.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @author Pikachu
 * 2020/10/15.
 */
@Service
public class PaymentService {

	public String paymentInfo_OK(Integer id) {
		return "线程池: " + Thread.currentThread().getName() + "  paymentInfo_OK:  " + id + "\t" + "哈哈";
	}

	@HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")  //3秒钟以内就是正常的业务逻辑

	})
	public String paymentInfo_Timeout(Integer id) {
		//int i = 10/0;
		int timeNumber = 3;
		try {
			TimeUnit.SECONDS.sleep(timeNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "线程池：" + Thread.currentThread().getName() + "   paymentInfo_TimeOut,id：  " + id + "\t" + "呜呜呜" + " 耗时(秒)";
	}

	public String paymentInfo_TimeoutHandler(Integer id) {
		return "线程池：" + Thread.currentThread().getName() + "   系统繁忙,请稍后再试!,id：  " + id + "\t" + "::>_<::";

	}

	//===============服务熔断==========================
	@HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
			@HystrixProperty(name = "circuitBreaker.enabled",value = "true"),  //是否开启断路器
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),   //请求次数
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),  //时间范围
			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"), //失败率达到多少后跳闸
	})
	public String paymentCircuitBreaker(@PathVariable("id") Integer id){
		if (id < 0){
			throw new RuntimeException("*****id 不能负数");
		}
		String serialNumber = IdUtil.simpleUUID();

		return Thread.currentThread().getName()+"\t"+"调用成功,流水号："+serialNumber;
	}
	public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id){
		return "id 不能负数，请稍候再试,(┬＿┬)/~~     id: " +id;
	}



}