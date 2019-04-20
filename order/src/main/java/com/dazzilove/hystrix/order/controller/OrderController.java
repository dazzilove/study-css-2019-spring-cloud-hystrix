package com.dazzilove.hystrix.order.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
	@RequestMapping(value = "/order/print", method = RequestMethod.GET)
	public String print() {
		return "OrderController Call!";
	}

	@RequestMapping(value = "/order/product/{id}", method = RequestMethod.GET)
	public String getProductById(@PathVariable("id") String id) {
		return "Order Call - Product Id = " + id;
	}
}
