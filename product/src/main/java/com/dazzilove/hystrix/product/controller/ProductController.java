package com.dazzilove.hystrix.product.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
	@RequestMapping(value = "/product/print", method = RequestMethod.GET)
	public String print() {
		return "ProductController Call!";
	}

	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	public String getProductById(@PathVariable("id") String id) {
		return "{id:"+id+", name:mong"+ id +"}";
	}
}
