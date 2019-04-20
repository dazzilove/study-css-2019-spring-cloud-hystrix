package com.dazzilove.hystrix.order.controller;

import com.dazzilove.hystrix.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
	@Autowired
	OrderService orderService;

	@RequestMapping(value = "/order/print", method = RequestMethod.GET)
	public String print() {
		return "OrderController Call!";
	}

	@RequestMapping(value = "/order/product/{id}", method = RequestMethod.GET)
	public String getProductById(@PathVariable("id") String id) {
		return "Order Call - Product = " + orderService.getProductById(id);
	}
}
