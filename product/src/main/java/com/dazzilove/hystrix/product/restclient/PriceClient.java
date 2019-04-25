package com.dazzilove.hystrix.product.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "price-service", url = "http://localhost:10003", fallback = PriceClientFallback.class)
public interface PriceClient {
    @RequestMapping(value = "/price/{productId}", method = RequestMethod.GET)
    public String getPrice(@PathVariable("productId") String productId);
}
