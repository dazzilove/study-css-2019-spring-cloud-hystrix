package com.dazzilove.hystrix.product.restclient;

import org.springframework.stereotype.Component;

@Component
public class PriceClientFallback implements PriceClient {
    @Override
    public String getPrice(String productId) {
        return "Price > PriceClientFallback > getPrice";
    }
}
