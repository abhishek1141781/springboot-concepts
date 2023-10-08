package com.aop.services;

public class PaymentServiceImpl implements PaymentService {

	public void makePayment() {
		
		//payment code
		
		
		//Apply AOP:			auth, print: payment started 
		System.out.println("Amount debited....");
		
		//implementation of code
		//implementation of code
		//implementation of code
		
		System.out.println("amout credited....");

	}

	public void makePayment100(int hund) {
		//payment code
		
		
				//Apply AOP:			auth, print: payment started 
				System.out.println(hund + " :  Amount debited....");
				
				//implementation of code
				//implementation of code
				//implementation of code
				
				System.out.println(hund+" : amout credited....");

		
	}

}
