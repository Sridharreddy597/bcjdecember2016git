package com.bcj.restexamplespringboot.service;

import java.util.ArrayList;

import com.bcj.restexamplespringboot.model.Customer;


public interface CustomerService {


	public int  add(int a, int b);
	

	public ArrayList<Customer> getListOfCustomers();
	

	public Customer getCustomer(int id);
	
	
	public boolean deleteCustomer(int id);

	public boolean createCustomer(Customer cust);
	

	public boolean updateCustomer(int  id, Customer cust);
	
	
}
