package com.dazzilove.hystrix.order.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "getOrderProductByIdFallback")
	public String getOrderProductById(String id) {
		return (String) restTemplate.getForObject("http://localhost:10002/product/" + id, String.class);
	}

	private String getOrderProductByIdFallback(String id) {
		return "Call getOrderProductByIdFallback method.";
	}
}
