package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	private PaymentService paymentService;
	
	
	public OrderService(PaymentService paymentService , int x) {
		
}
	@Autowired
	public OrderService(PaymentService paymentService) {
			this.paymentService = paymentService;
	}
	
	public void placeOrder() {
		
		paymentService.proccessPayment(10);
	}

//	public void setPaymentService(PaymentService paymentService) {
//		this.paymentService = paymentService;
//	}
	
	

}
