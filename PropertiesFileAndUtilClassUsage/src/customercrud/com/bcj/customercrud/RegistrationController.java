package com.bcj.customercrud;

public class RegistrationController {
	
	public boolean saveCustomer(String firstName, String lastName, String email,String mobile , String choice ){
		Customer cust = new Customer();
		cust.setFirstName(firstName);
		cust.setLastName(lastName);
		cust.setEmail(email);
		cust.setMobile(mobile);
		String choice1=choice;
		RegistrationService rSrve=new RegistrationService();
		return rSrve.saveCustomer(cust, choice1);
	}

}
