package com.bcj.customercrud;

import java.sql.SQLException;

public class CustomerCrudService {

	public boolean deleteCustomer(String firstName, String choice) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		CustomerCrudDao custCrudDao=new CustomerCrudDao();
		return custCrudDao.deleteCustomer(firstName, choice);
	}

	public boolean updateCustomer(String firstName,String updateField, String updateChoice,String choice) {
		// TODO Auto-generated method stub
		CustomerCrudDao custCrudDao=new CustomerCrudDao();
		try {
			return custCrudDao.updateCustomer(firstName,updateField, updateChoice,choice);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
