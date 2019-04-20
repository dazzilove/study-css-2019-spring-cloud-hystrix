package com.dazzilove.hystrix.order.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
	@RequestMapping(value = "/order/print", method = RequestMethod.GET)
	public String print() {
		return "OrderController Call!";
	}

	@RequestMapping(value = "/order/product/{id}", method = RequestMethod.GET)
	public String getProductById(@PathVariable("id") String id) {

		RestTemplate restTemplate = new RestTemplate();
		String product = (String) restTemplate.getForObject("http://localhost:10002/product/" + id, String.class);
		return "Order Call - Product Id = " + product;
	}
}
