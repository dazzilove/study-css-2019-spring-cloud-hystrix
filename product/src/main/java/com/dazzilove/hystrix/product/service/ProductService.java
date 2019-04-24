package com.dazzilove.hystrix.product.service;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "getProductByIdFallback")
	public String getProductById(String id) {
		String price = restTemplate.getForObject("http://localhost:10003/price/" + id, String.class);
		return "{id:"+id+", name:mong"+ id +", price:" + price + "}";
	}

	private String getProductByIdFallback(String id) {
		return "fallback result {id:" + id + ", name=temp, price:0}";
	}
}
