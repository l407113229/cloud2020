package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author Pikachu
 * 2020/10/20.
 */
@Component
public class PaymentFallbackService implements PaymentService {
	@Override
	public CommonResult<Payment> paymentSQL(Long id) {
		return new CommonResult<Payment>(4444,"服务降级返回,----PaymentFallbackService",new Payment(id,"errorSerial"));
	}
}
