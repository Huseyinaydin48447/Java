package com.springdemo;

import org.springframework.stereotype.Component;

@Component("database")
public class MySqlCustomerDal implements ICustomer {
	String connectionString;
	
	
	public String getConnectionString() {
		return connectionString;
	}


	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	public void add() {
		System.out.println("Connection String : "+this.connectionString);

		System.out.println("MySql veri taban�");
	}
}
