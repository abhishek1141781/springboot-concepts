package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;


public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/config.xml");

		PaymentService paymentObject = context.getBean("payment", PaymentService.class);
		
		paymentObject.makePayment();
		paymentObject.makePayment100(100);
		
	}
}




//<artifactId>spring-core</artifactId>
//<!-- <version>6.0.11</version>  version error, not compatible with java11-->

//Error: Unable to initialize main class com.aop.App
//Caused by: java.lang.UnsupportedClassVersionError: org/springframework/context/ApplicationContext
//has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the
//Java Runtime only recognizes class file versions up to 55.0
