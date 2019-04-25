package com.dazzilove.hystrix.order.service;

import com.dazzilove.hystrix.order.restclient.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	ProductClient productClient;

	public String getOrderProductById(String id) {
		return (String) productClient.getProductById(id);
	}
}
