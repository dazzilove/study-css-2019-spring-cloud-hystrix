package com.dazzilove.hystrix.order.controller;

import org.junit.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Random;

public class OrderControllerTest {
	TestRestTemplate restTemplate = new TestRestTemplate();

	@Test
	public void testOrder() throws InterruptedException {
		for(int i=0; i<1000; i++) {
			sendAndAcceptOrder();
			Thread.sleep(100);
		}
	}

	private void sendAndAcceptOrder() {
		try {
			Random r = new Random();
			String productId = String.valueOf(r.nextInt(3)+1);
			String productInfo = restTemplate.getForObject("http://localhost:10001/order/product/" + productId, String.class);
		} catch(Exception e) {

		}
	}
}
