package com.dazzilove.hystrix.product.service;

import com.dazzilove.hystrix.product.restclient.PriceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    PriceClient priceClient;

	public String getProductById(String id) {
		String price = priceClient.getPrice(id);
		return "{id:"+id+", name:mong"+ id +", price:" + price + "}";
	}
}
