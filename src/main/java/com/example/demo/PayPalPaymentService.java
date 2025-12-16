package com.example.demo;

public class PayPalPaymentService implements PaymentService{

	@Override
	public void proccessPayment(double amount) {
		System.out.println("PAYPAL");
		System.out.println("Amount: "+ amount);
		
	}

}
