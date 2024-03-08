package com.spring.aop.service.impl;

import com.spring.aop.service.PaymentService;

public class PaymentServiceImpl implements PaymentService {

	public void makePayment() {

		System.out.println("Amount Debited");

		System.out.println("Amount Credited");
	}

	public void makePayment(int amount) {
		
		System.out.println(amount+" Amount Debited");

		System.out.println(amount+" Amount Credited");
	}
}
