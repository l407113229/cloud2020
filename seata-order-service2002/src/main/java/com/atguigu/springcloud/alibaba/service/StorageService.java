package com.atguigu.springcloud.alibaba.service;

/**
 * @author Pikachu
 * 2020/10/20.
 */
public interface StorageService {
	// 扣减库存
	void decrease(Long productId, Integer count);
}
