package com.dazzilove.hystrix.price.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {
	@RequestMapping(value = "/price/{productId}", method = RequestMethod.GET)
	public String getPrice(@PathVariable("productId") String productId) {
		return String.valueOf(1000 * Long.parseLong(productId));
	}
}
