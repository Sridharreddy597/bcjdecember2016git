package com.bcj.soapservice.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.bcj.soapservice.dao.CustomerDao;
import com.bcj.soapservice.model.Customer;

@WebService(endpointInterface="com.bcj.soapservice.service.CustomerService",portName="CustomerServicePort",serviceName="CustomerService")
public class CustomerServiceImpl implements  CustomerService{
	
	CustomerDao custDao= new CustomerDao();
	

	public ArrayList<Customer> getListOfCustomers() {		
		return custDao.getCustomerList();
	}

	public Customer getCustomer(int id) {
		
		
		return custDao.getCustomer(id);
	}

	public boolean deleteCustomer(int id) {
		return custDao.deleteCustomer(id);
	}

	public boolean createCustomer(Customer cust) {
		if(custDao.createCustomer(cust))
		return true;
		else return false;
	}

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public boolean updateCustomer(int  id, Customer cust) {
		
		if(custDao.updateCustomer(id, cust))
			return true;
			else return false;
	}

	
}
