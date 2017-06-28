package com.bcj.customercrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerCrudDao {
	 boolean flag;
	Connection con;
	DBUtil dbutil;

	public boolean deleteCustomer(String firstName, String choice) throws ClassNotFoundException, SQLException {

		if (choice.equals("1")) {
			dbutil = new DBUtil();
			con = dbutil.getConnectionbyHardCode();
			return deleteCustmer(firstName);

		}

		else {
			dbutil = new DBUtil();
			con = dbutil.getConnectionByPropertiesFile();

			return deleteCustmer(firstName);

		}

	}

	private boolean deleteCustmer(String firstName) throws SQLException {
		// TODO Auto-generated method stub
		int rows = 0;
		if (con != null) {
			System.out.println("connected to database elimination ");
			String sql = "DELETE FROM customer where firstname=?";
			PreparedStatement stmnt = con.prepareStatement(sql);
			stmnt.setString(1, firstName);
			rows = stmnt.executeUpdate();
			// System.out.println("customer deleted sucessfully ");
			stmnt.close();
			con.close();
		}

		if (rows != 0)
			return true;
		else
			return false;

	}

	public boolean updateCustomer(String firstName, String updateField, String updateChoice, String choice)
			throws ClassNotFoundException, SQLException {
		
		// TODO Auto-generated method stub
		if (choice.equals("1")) {
			dbutil = new DBUtil();
			con = dbutil.getConnectionbyHardCode();

			if (updateChoice.equals("1"))
				flag=updateFirstName(firstName, updateField);

			else if (updateChoice.equals("2"))
				flag=updateLastName(firstName, updateField);

			else if (updateChoice.equals("3"))
				flag=updateEmail(firstName, updateField);

			else if (updateChoice.equals("4"))
				flag=updateMobile(firstName, updateField);
//return flag;
		}

		else {
			dbutil = new DBUtil();
			con = dbutil.getConnectionByPropertiesFile();

			if (updateChoice.equals("1"))
				flag=updateFirstName(firstName, updateField);

			else if (updateChoice.equals("2"))
				flag=updateLastName(firstName, updateField);

			else if (updateChoice.equals("3"))
			flag=	updateEmail(firstName, updateField);

			else if (updateChoice.equals("4"))
				flag=updateMobile(firstName, updateField);

		}
		//return flag;
		return flag;
		
	}

	private boolean updateMobile(String firstName, String updateField) throws SQLException {
		// TODO Auto-generated method stub

		int rows = 0;
		if (con != null) {
			System.out.println("connected to database elimination ");
			String sql = "update customer set phone=? where firstname=?";
			PreparedStatement stmnt = con.prepareStatement(sql);
			stmnt.setString(1, updateField);
			stmnt.setString(2, firstName);
			rows = stmnt.executeUpdate();
			// System.out.println("customer deleted sucessfully ");
			stmnt.close();
			con.close();
		}

		if (rows != 0)
			return true;
		else
			return false;

	}

	private boolean updateEmail(String firstName, String updateField) throws SQLException {
		// TODO Auto-generated method stub

		int rows = 0;
		if (con != null) {
			System.out.println("connected to database elimination ");
			String sql = "update customer set email=? where firstname=?";
			PreparedStatement stmnt = con.prepareStatement(sql);
			stmnt.setString(1, updateField);
			stmnt.setString(2, firstName);
			rows = stmnt.executeUpdate();
			// System.out.println("customer deleted sucessfully ");
			stmnt.close();
			con.close();
		}

		if (rows != 0)
			return true;
		else
			return false;

	}

	private boolean updateLastName(String firstName, String updateField) throws SQLException {
		// TODO Auto-generated method stub

		int rows = 0;
		if (con != null) {
			System.out.println("connected to database elimination ");
			String sql = "update customer set lastname=? where firstname=?";
			PreparedStatement stmnt = con.prepareStatement(sql);
			stmnt.setString(1, updateField);
			stmnt.setString(2, firstName);
			rows = stmnt.executeUpdate();
			// System.out.println("customer deleted sucessfully ");
			stmnt.close();
			con.close();
		}

		if (rows != 0)
			return true;
		else
			return false;

	}

	private boolean updateFirstName(String firstName, String updateField) throws SQLException {
		// TODO Auto-generated method stub

		int rows = 0;
		if (con != null) {
			System.out.println("connected to database elimination ");
			String sql = "update customer set firstname=? where firstname=?";
			PreparedStatement stmnt = con.prepareStatement(sql);
			stmnt.setString(1, updateField);
			stmnt.setString(2, firstName);
			rows = stmnt.executeUpdate();
			// System.out.println("customer deleted sucessfully ");
			stmnt.close();
			con.close();
		}

		if (rows != 0)
			return true;
		else
			return false;

	}
}
