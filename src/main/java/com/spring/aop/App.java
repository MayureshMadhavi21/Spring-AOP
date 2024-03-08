package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.service.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/aop/config.xml");
        PaymentService paymentObject = context.getBean("payment",PaymentService.class);
        paymentObject.makePayment();
        System.out.println("-----------------------------------");
        paymentObject.makePayment(10000);
        
        ((AbstractApplicationContext) context).close();
        
    }
}
