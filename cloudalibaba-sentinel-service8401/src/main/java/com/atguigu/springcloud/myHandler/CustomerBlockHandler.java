package com.atguigu.springcloud.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @author Pikachu
 * 2020/10/20.
 */
public class CustomerBlockHandler {

	public static CommonResult handleException(BlockException exception) {
		return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");
	}
	public static CommonResult handleException2(BlockException exception) {
		return new CommonResult(4444, "自定义限流处理信息....CustomerBlockHandler2");
	}
}
