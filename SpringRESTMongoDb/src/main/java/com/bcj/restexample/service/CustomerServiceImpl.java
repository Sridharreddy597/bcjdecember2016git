package com.bcj.restexample.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bcj.restexample.dao.CustomerDao;
import com.bcj.restexample.model.Customer;


public class CustomerServiceImpl  {

	@Autowired
	CustomerDao custDao ;

	
	/*public ArrayList<Customer> getListOfCustomers() {
		return custDao.getCustomerList();
	}
*/

	public Customer getCustomer( int id) {
		return custDao.getCustomer(id);
	}


	public int deleteCustomer( int id) {
		return custDao.deleteCustomer(id);
	}

	public boolean createCustomer(Customer cust) {
		if (custDao.createCustomer(cust))
			return true;
		else
			return false;
	}


	public int add(int a,  int b) {

		return a + b;
	}


	public boolean updateCustomer( int id, Customer cust) {

		if (custDao.updateCustomer(id, cust))
			return true;
		else
			return false;
	}



}
