package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootFirstTryApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = 	SpringApplication.run(SpringBootFirstTryApplication.class, args);
	var orderService = 	context.getBean(OrderService.class);
	
	
		//var orderService = new OrderService(new PayPalPaymentService());
		//var orderService = new OrderService();
		//orderService.setPaymentService(new PayPalPaymentService());
		orderService.placeOrder();
	}

}
