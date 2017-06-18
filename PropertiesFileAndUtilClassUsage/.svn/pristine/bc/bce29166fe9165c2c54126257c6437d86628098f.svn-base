package com.bcj.customercrud;

import java.sql.SQLException;

public class CustomerCrudController {
	
public boolean deleteCustomer(String firstName, String choice)
	{
	
	CustomerCrudService custCrudSrvce= new CustomerCrudService();
	try {
		return custCrudSrvce.deleteCustomer(firstName,choice);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
	}

public boolean updateCustomer(String firstName,String updateField, String updateChoice,String choice  ) {
	// TODO Auto-generated method stub
	CustomerCrudService custCrudSrvce= new CustomerCrudService();
	return custCrudSrvce.updateCustomer( firstName,updateField, updateChoice,choice);
}

}
