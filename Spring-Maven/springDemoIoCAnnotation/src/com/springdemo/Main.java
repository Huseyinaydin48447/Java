package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =new 
				AnnotationConfigApplicationContext(IocConfig.class);
		
		
		
		// TODO Auto-generated method stub
//		CustomerManager customer=new CustomerManager(new CustomerDal());
//2		
//		CustomerManager customer=new CustomerManager
//				(context.getBean("database",ICustomer.class));
//		customer.add();
	
		ICustomer customerDal=context.getBean("database",ICustomer.class);
		customerDal.add();
	
	}

}
