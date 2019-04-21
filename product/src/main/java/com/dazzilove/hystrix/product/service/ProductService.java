package com.dazzilove.hystrix.product.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@HystrixCommand
	public String getProductById(String id) {
		return "{id:"+id+", name:mong"+ id +"}";
	}

	private String getProductByIdFallback(String id) {
		return "fallback result {id:" + id + ", name=temp}";
	}
}
