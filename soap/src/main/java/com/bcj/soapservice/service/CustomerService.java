package com.bcj.soapservice.service;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.bcj.soapservice.model.Customer;

@WebService
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT)
public interface CustomerService {

	@WebMethod
	public int add(int a, int b);
	
	@WebMethod
	public ArrayList<Customer> getListOfCustomers();
	
	@WebMethod
	public Customer getCustomer(int id);
	
	@WebMethod
	public boolean deleteCustomer(int id);
	
	@WebMethod
	public boolean createCustomer(Customer cust);
	
	@WebMethod
	public boolean updateCustomer(int  id, Customer cust);
	
	
}
