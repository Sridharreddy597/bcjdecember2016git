package com.bcj.customercrud;

import java.sql.SQLException;

public class RegistrationService {
	
	public boolean saveCustomer(Customer cust, String Choice){
		
		
		RegistrationDao rDao=new RegistrationDao();
		
		try {
			try {
				return rDao.saveCustomer(cust, Choice);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
		
		
	}
	

	
}
