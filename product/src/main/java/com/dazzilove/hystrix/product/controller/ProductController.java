package com.dazzilove.hystrix.product.controller;

import com.dazzilove.hystrix.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;

	@RequestMapping(value = "/product/print", method = RequestMethod.GET)
	public String print() {
		return "ProductController Call!";
	}

	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	public String getProductById(@PathVariable("id") String id) {
		return productService.getProductById(id);
	}
}
