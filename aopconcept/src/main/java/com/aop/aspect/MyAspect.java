package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	// advices("Pointcut expression")
	// advices("before execution of this method(*(any return type) 
	//	com.aop.servicesPaymentServiceImpl.makePayment()")
	@Before("execution(* com.aop.services.PaymentServiceImpl.makePayment())")
	public void printBefore() {
		System.out.println("payemtn started ....");
	}

	@After("execution(* com.aop.services.PaymentServiceImpl.makePayment())")
	public void printAfter() {
		System.out.println("payment ended....");
	}
	
	// for 100 rupees
	
	@Before("execution(* com.aop.services.PaymentServiceImpl.makePayment100(..))")
	public void printBefore100() {
		System.out.println("100 rup payemtn started ....");
	}
	
	@After("execution(* com.aop.services.PaymentServiceImpl.makePayment100(..))")
	public void printAfter100() {
		System.out.println("100 rup payment ended....");
	}

}





//why is the @aspect not available for MyAspect Class
//Solution: because of the scope tag, which is set to runtime

//<!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->
//<dependency>
//    <groupId>org.aspectj</groupId>
//    <artifactId>aspectjweaver</artifactId>
//    <version>1.9.20.1</version>
//    <scope>runtime</scope>
//</dependency>
