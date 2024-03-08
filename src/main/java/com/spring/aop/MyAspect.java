package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	// * for all types of return type
	@Before("execution(* com.spring.aop.service.impl.PaymentServiceImpl.makePayment())")
	public void printBefore() {
		System.out.println("payment started");
	}

	@After("execution(* com.spring.aop.service.impl.PaymentServiceImpl.makePayment())")
	public void printAfter() {
		System.out.println("payment completed");
	}

	@Before("execution(* com.spring.aop.service.impl.PaymentServiceImpl.makePayment(..))")
	public void printBeforeWithArgument() {
		System.out.println("payment started with amount mention");
	}

	// .. for function argument > use only if argument is present
	@After("execution(* com.spring.aop.service.impl.PaymentServiceImpl.makePayment(..))")
	public void printAfterWithArgument() {
		System.out.println("payment completed with amount mention");
	}

}
