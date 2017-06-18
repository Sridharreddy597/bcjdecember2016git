package com.bcj.customercrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationDao {

	Connection con;
	DBUtil dbutil;

	public boolean saveCustomer(Customer cust, String choice) throws SQLException, ClassNotFoundException {
		if (choice.equals("1")) {
			dbutil = new DBUtil();
			con = dbutil.getConnectionbyHardCode();
			return method(cust);

		}

		else   {
			dbutil = new DBUtil();
			con = dbutil.getConnectionByPropertiesFile();

			return method(cust);

		}
		
	}

	private boolean method(Customer cust) throws SQLException {
		// TODO Auto-generated method stub
		int rows = 0;
		if (con != null) {
			System.out.println("connected to database elimination ");
			String sql = "INSERT INTO customer  values (?,?,?,?,?,?,?)";
			PreparedStatement stmnt = con.prepareStatement(sql);

			stmnt.setString(1, cust.getFirstName());
			stmnt.setString(2, cust.getLastName());
			stmnt.setString(3, cust.getEmail());
			stmnt.setString(4, cust.getMobile());
			stmnt.setString(5, null);
			stmnt.setString(6, null);
			stmnt.setString(7, null);
			rows = stmnt.executeUpdate();
			//System.out.println("cutomer saved sucessfully   ");
			stmnt.close();
			con.close();
		}

		if (rows != 0)
			return true;
		else
			return false;

	}
}
