package com.sridhar.elimination.service;

import java.util.Random;

import com.sridhar.elimination.dao.CustomerDao;
import com.sridhar.elimination.modal.Customer;

public class CutomerService {

	
	public boolean generateCustomerId(Customer cust){
		
		Random rand = new Random();

		int randomNum = 10000 + rand.nextInt(90000);
		String customerId = Integer.toString(randomNum);
		cust.setCustomerId(customerId);		
		CustomerDao cdao=new CustomerDao();
		cdao.saveCustomer(cust);
		
		return true;
		
	}
}
