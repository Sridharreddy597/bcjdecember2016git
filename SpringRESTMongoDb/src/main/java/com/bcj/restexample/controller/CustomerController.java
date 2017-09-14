package com.bcj.restexample.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bcj.restexample.model.Customer;
import com.bcj.restexample.service.CustomerServiceImpl;

@RestController
public class CustomerController {


	@Autowired
	CustomerServiceImpl custsrvc ;



/*	
	@RequestMapping(value="/getall",method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> getAllEmployees() {
		List<Customer> customers = custsrvc.getListOfCustomers();
		if (customers.isEmpty()) {
			System.out.println("Employees does not exists");
			return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
		}
		System.out.println("Found " + customers.size() + " Employees");
		System.out.println(Arrays.toString(customers.toArray()));
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}*/
	
	
	
	

	
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> getEmployee(@PathVariable("id") int id) {
		Customer customer = custsrvc.getCustomer(id);
		if (customer == null) {
			System.out.println("customer with id " + id + " does not exists");
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
		System.out.println("Found customer:: " + customer);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	
	


	
	
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") int id) {
		Customer customer = custsrvc.getCustomer(id);
		if (customer == null) {
			System.out.println("customer with id " + id + " does not exists");
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			custsrvc.deleteCustomer(id);
			System.out.println("customer with id " + id + " deleted");
			return new ResponseEntity<Void>(HttpStatus.GONE);
		}
	}

	
	
	
		
	
	
	
	@RequestMapping(value="/create", method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> addEmployee(@RequestBody Customer cust) {
		if(custsrvc.createCustomer(cust))
			return new ResponseEntity<Customer>(cust, HttpStatus.CREATED);
		else 
			return new ResponseEntity<Customer>(cust, HttpStatus.NO_CONTENT);
			

		
	}


	
	


	@RequestMapping(value="/add/{a}/{b}", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody int add(@PathVariable("a") int a, @PathVariable("b") int b) {
		return a + b;
	}



	
	@RequestMapping(value="/update",method = RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateEmployee(@RequestBody Customer cust) {
		Customer existingCust = custsrvc.getCustomer(cust.get_id());
		if (existingCust == null) {
			System.out.println("Employee with id " + cust.get_id() + " does not exists");
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			if(custsrvc.updateCustomer(cust.get_id(), cust))
			return new ResponseEntity<Void>(HttpStatus.OK);
			else return new ResponseEntity<Void>(HttpStatus.FORBIDDEN);
		}
	}
	
	
	
	
	
}
