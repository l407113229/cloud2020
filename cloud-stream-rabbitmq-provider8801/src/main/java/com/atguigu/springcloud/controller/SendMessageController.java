package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Pikachu
 * 2020/10/19.
 */
@RestController
public class SendMessageController {

	@Resource
	private IMessageProvider iMessageProvider;

	@GetMapping(value = "/sendMessage")
	public String sendMessag(){
		return iMessageProvider.send();
	}
}
