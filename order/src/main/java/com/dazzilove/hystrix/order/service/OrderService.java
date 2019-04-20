package com.dazzilove.hystrix.order.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "getProductByIdFallback")
	public String getProductById(String id) {
		String product = restTemplate.getForObject("http://localhost:10002/product/" + id, String.class);
		return "@HystrixCommand - " + product;
	}

	private String getProductByIdFallback(String id) {
		return "Call getProductByIdFallback method.";
	}
}
