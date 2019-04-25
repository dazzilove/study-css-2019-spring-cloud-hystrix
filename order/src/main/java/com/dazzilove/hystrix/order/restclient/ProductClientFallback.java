package com.dazzilove.hystrix.order.restclient;

import org.springframework.stereotype.Component;

@Component
public class ProductClientFallback implements ProductClient {

    @Override
    public String getProductById(String id) {
        return "order feign ProductClientFallback";
    }
}
