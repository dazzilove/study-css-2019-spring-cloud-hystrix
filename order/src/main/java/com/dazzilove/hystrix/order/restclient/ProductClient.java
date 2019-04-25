package com.dazzilove.hystrix.order.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "product-service", url="http://localhost:10002", fallback = ProductClientFallback.class)
public interface ProductClient {
    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    String getProductById(@PathVariable("id") String id);
}
