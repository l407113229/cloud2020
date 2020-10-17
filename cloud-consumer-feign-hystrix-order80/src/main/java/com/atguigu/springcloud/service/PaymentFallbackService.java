package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Pikachu
 * 2020/10/16.
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
	@Override
	public String paymentInfo_OK(Integer id) {
		return "---------PaymentFallbackService fullBack  paymentInfo_OK";
	}

	@Override
	public String paymentInfo_TimeOut(Integer id) {
		return "---------PaymentFallbackService fullBack  paymentInfo_TimeOut";
	}
}
