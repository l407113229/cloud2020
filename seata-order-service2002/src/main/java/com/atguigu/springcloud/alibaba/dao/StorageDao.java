package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Pikachu
 * 2020/10/20.
 */
@Mapper
public interface StorageDao {

	//扣减库存信息
	void decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
