package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext
				("applicationContext.xml");
		
		
		
		// TODO Auto-generated method stub
//		CustomerManager customer=new CustomerManager(new CustomerDal());
//2		
//		CustomerManager customer=new CustomerManager
//				(context.getBean("database",ICustomer.class));
//		customer.add();
		
		ICustomerService customerService=context.getBean("service",ICustomerService.class);
		customerService.add();
	
	}

}
