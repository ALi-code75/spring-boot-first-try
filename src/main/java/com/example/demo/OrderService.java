package com.example.demo;

public class OrderService {
	
	private PaymentService paymentService;
	
	public OrderService(PaymentService paymentService) {
			this.paymentService = paymentService;
	}
	
	public void placeOrder() {
		
		paymentService.proccessPayment(10);
	}

}
