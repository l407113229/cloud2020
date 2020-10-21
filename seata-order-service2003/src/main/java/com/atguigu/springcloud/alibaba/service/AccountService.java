package com.atguigu.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Pikachu
 * 2020/10/20.
 */
public interface AccountService {
	/**
	 * 扣减账户余额
	 */
	void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
