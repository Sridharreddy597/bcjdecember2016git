package com.bcj.restclient.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bcj.restclient.model.Customer;
import com.bcj.restclient.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService custService;

	public void setCustService(CustomerService custService) {
		this.custService = custService;
	}

	@RequestMapping("/")
	public String welcomepage() {
		System.out.println("customer0");
		return "index";
	}

	@RequestMapping("/postfrm")
	public String displayPostForm(Model model) {
		return "postfrm";
	}

	@RequestMapping("/putfrm")
	public String displayPutForm() {
		return "putfrm";
	}

	
	@RequestMapping("/delfrm")
	public String displayDeleteForm() {
		return "delfrm";
	}
	
	@RequestMapping("/getfrm")
	public String getcustomer() {
		return "getfrm";
	}

	
	@RequestMapping("/getfrm/{id}")
	public @ResponseBody Customer getcustomerById(@PathVariable("id") String id) {		
		Customer c = custService.getCustomer(id);
		System.out.println(c.getFirstName() + "   " + c.getLastName() + "    " + c.getId());
		return c;
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody Customer submittedcustomerData(@RequestBody Customer cust, HttpServletRequest request) {
				Customer c = custService.saveCustomer(cust);
		return c;
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public @ResponseBody Customer updatedcustomerData(@RequestBody Customer cust, HttpServletRequest request) {
				Customer c = custService.updateCustomer(cust);
		return c;
	}
	
	@RequestMapping("/delfrm/{id}")
	public @ResponseBody String deletecustomerById(@PathVariable("id") String id) {		
		 custService.deleteCustomer(id);
		//System.out.println(c.getFirstName() + "   " + c.getLastName() + "    " + c.getId());
		 System.out.println("deleted sucessfully");
		return "deleted sucessfully";
	}
	

}
