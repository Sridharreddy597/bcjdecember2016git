package com.sridhar.elimination.controller;

import com.sridhar.elimination.modal.Customer;
import com.sridhar.elimination.service.LoginService;

public class LoginController {

	public boolean verifyCustomer(Customer lcst) {
		// TODO Auto-generated method stub
		
		LoginService lService=new LoginService();
		return lService.verifyCustomer(lcst);
	}
	
	
		
		
	}


