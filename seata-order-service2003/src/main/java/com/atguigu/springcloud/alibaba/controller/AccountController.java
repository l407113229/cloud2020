package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.domain.CommonResult;
import com.atguigu.springcloud.alibaba.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author Pikachu
 * 2020/10/20.
 */
@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	/**
	 * 扣减账户余额
	 */
	@RequestMapping(value = "/account/decrease")
	public CommonResult decrease(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money){
		accountService.decrease(userId,money);
		return new CommonResult(200,"扣减账户余额成功！");
	}
}
