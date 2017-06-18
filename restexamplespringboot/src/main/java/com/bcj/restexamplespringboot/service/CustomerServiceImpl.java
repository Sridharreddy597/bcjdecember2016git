package com.bcj.restexamplespringboot.service;

import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.bcj.restexamplespringboot.dao.CustomerDao;
import com.bcj.restexamplespringboot.model.Customer;


@RequestMapping("/customer")  @RestController
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class CustomerServiceImpl implements  CustomerService{
	final static Logger logger = Logger.getLogger(CustomerServiceImpl.class);

	
	@Autowired
	private CustomerDao custDao;
	
		public CustomerDao getCustDao() {
		return custDao;
	}

	public void setCustDao(CustomerDao custDao) {
		this.custDao = custDao;
	}

		@GET 
		@Path("/getall")
		@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ArrayList<Customer> getListOfCustomers() {	
			logger.info("customer getall() invoked");
		return custDao.getCustomerList();
	}

	@Path("/get/{id}") 
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Customer getCustomer(@PathParam("id") int id) {	
		logger.info("customer getall() invoked");
		return custDao.getCustomer(id);
	}

	@Path("/{id}") @DELETE
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public boolean deleteCustomer(@PathParam("id") int id) {
		logger.info("customer getall() invoked");
		return custDao.deleteCustomer(id);
	}
	 @POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public boolean createCustomer(Customer cust) {
		 logger.info("customer getall() invoked");
		if(custDao.createCustomer(cust))
		return true;
		else return false;
	}

	@GET
	@Path("/add/{a}/{b}") 
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
		public int  add(@PathParam("a") int a, @PathParam("b") int b) {
		
		logger.info("customer getall() invoked");
		return a+b;
	}

	@Path("/{id}") @PUT
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public boolean updateCustomer(@PathParam("id")int  id, Customer cust) {
		logger.info("customer getall() invoked");
		
		if(custDao.updateCustomer(id, cust))
			return true;
			else return false;
	}

	
}
