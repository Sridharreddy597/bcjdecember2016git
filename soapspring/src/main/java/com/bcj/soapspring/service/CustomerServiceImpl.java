package com.bcj.soapspring.service;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import com.bcj.soapspring.dao.CustomerDao;
import com.bcj.soapspring.model.Customer;

@WebService(endpointInterface="com.bcj.soapspring.service.CustomerService")
public class CustomerServiceImpl implements  CustomerService{
	
	@Autowired
	private CustomerDao custDao;
	

	public CustomerDao getCustDao() {
		return custDao;
	}

	public void setCustDao(CustomerDao custDao) {
		this.custDao = custDao;
	}

	@WebMethod
	public ArrayList<Customer> getListOfCustomers() {		
		return custDao.getCustomerList();
	}
	@WebMethod
	public Customer getCustomer(int id) {
		return custDao.getCustomer(id);
	}
	@WebMethod
	public boolean deleteCustomer(int id) {
		return custDao.deleteCustomer(id);
	}
	@WebMethod
	public boolean createCustomer(Customer cust) {
		if(custDao.createCustomer(cust))
		return true;
		else return false;
	}
	@WebMethod
	public int add(int a, int b) {
		return a+b;
	}
	@WebMethod
	public boolean updateCustomer(int  id, Customer cust) {
		if(custDao.updateCustomer(id, cust))
			return true;
			else return false;
	}

	
}
