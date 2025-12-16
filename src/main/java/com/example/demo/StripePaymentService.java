package com.example.demo;

public class StripePaymentService implements PaymentService {
	
	@Override
	public void proccessPayment(double amount) {
		System.out.println("STRIPE");
		System.out.println("Amount: "+ amount);
	}

}
