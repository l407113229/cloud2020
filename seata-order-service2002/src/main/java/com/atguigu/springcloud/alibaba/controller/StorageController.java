package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.dao.StorageDao;
import com.atguigu.springcloud.alibaba.domain.CommonResult;
import com.atguigu.springcloud.alibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pikachu
 * 2020/10/20.
 */
@RestController
public class StorageController {

	@Autowired
	private StorageService storageService;

	//扣减库存
	@RequestMapping("/storage/decrease")
	public CommonResult decrease(Long productId, Integer count) {
		storageService.decrease(productId, count);
		return new CommonResult(200,"扣减库存成功！");
	}
}
