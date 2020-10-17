package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author Pikachu
 * 2020/10/15.
 */
public interface LoadBalancer {
	ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
