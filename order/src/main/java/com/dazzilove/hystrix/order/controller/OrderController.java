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
	public String getOrderProductById(@PathVariable("id") String id) {
		String product = orderService.getOrderProductById(id);
		return "Order Call - <br>Product = " + product;
	}
}
