package com.bcj.restexample.service;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bcj.restexample.dao.CustomerDao;
import com.bcj.restexample.model.Customer;

@Path("customer")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class CustomerServiceImpl implements CustomerService {

	CustomerDao custDao = new CustomerDao();

	@GET
	@Path("/getall")
	public ArrayList<Customer> getListOfCustomers() {
		return custDao.getCustomerList();
	}

	@Path("/get/{id}")
	@GET
	public Customer getCustomer(@PathParam("id") int id) {
		return custDao.getCustomer(id);
	}

	@Path("/delete/{id}")
	@DELETE
	public boolean deleteCustomer(@PathParam("id") int id) {
		return custDao.deleteCustomer(id);
	}

	@Path("/create")
	@POST
	public boolean createCustomer(Customer cust) {
		if (custDao.createCustomer(cust))
			return true;
		else
			return false;
	}

	@GET
	@Path("/add/{a}/{b}")
	public int add(@PathParam("a") int a, @PathParam("b") int b) {

		return a + b;
	}

	@Path("/update/{id}")
	@PUT
	public boolean updateCustomer(@PathParam("id") int id, Customer cust) {

		if (custDao.updateCustomer(id, cust))
			return true;
		else
			return false;
	}

}
