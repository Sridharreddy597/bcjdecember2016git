package com.bcj.CustomerServer.controller;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bcj.CustomerServer.model.Customer;
import com.bcj.CustomerServer.service.CustomerServiceImpl;




/**
 * 
 * @author BytesTree
 *
 */

@RestController
public class CustomerController {

	//final static Logger logger = Logger.getLogger(CustomerController.class);

	@Autowired
	CustomerServiceImpl custService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Customer> addEmployee(@RequestBody Customer employee) {
		custService.save(employee);
		//logger.debug("Added:: " + employee);
		return new ResponseEntity<Customer>(employee, HttpStatus.CREATED);
	}


	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Void> updateEmployee(@RequestBody Customer employee) {
		Customer existingEmp = custService.getById(employee.getId());
		if (existingEmp == null) {
		//	logger.debug("Employee with id " + employee.getId() + " does not exists");
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			custService.save(employee);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}


	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Customer> getEmployee(@PathVariable("id") Long id) {
		Customer employee = custService.getById(id);
		if (employee == null) {
		//	logger.debug("Employee with id " + id + " does not exists");
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
		//logger.debug("Found Employee:: " + employee);
		return new ResponseEntity<Customer>(employee, HttpStatus.OK);
	}


	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Customer>> getAllEmployees() {
		List<Customer> employees = custService.getAll();
		if (employees.isEmpty()) {
		//	logger.debug("Employees does not exists");
			return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
		}
		//logger.debug("Found " + employees.size() + " Employees");
		//logger.debug(Arrays.toString(employees.toArray()));
		return new ResponseEntity<List<Customer>>(employees, HttpStatus.OK);
	}


	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") Long id) {
		Customer employee = custService.getById(id);
		if (employee == null) {
			//logger.debug("Employee with id " + id + " does not exists");
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			custService.delete(id);
			//logger.debug("Employee with id " + id + " deleted");
			return new ResponseEntity<Void>(HttpStatus.GONE);
		}
	}

}
