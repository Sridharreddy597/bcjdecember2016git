package com.sridhar.elimination.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sridhar.elimination.modal.Customer;

public class LoginDao {
	String userId;
	String password;

	public boolean verifyCustomer(Customer lCust) {
		
		
		String conneturl = "jdbc:mysql://localhost:3306/elimination";
		String gate = "root";
		String code = "root";
		
		java.sql.Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(conneturl, gate, code);
			if (con != null)
				System.out.println("connected to database elimination ");
			String sql = "select userid , password from customer where userid= ?";
			PreparedStatement stmnt = con.prepareStatement(sql);
			stmnt.setString(1, lCust.getUserId());
			
			ResultSet rs = stmnt.executeQuery();
			while(rs.next()){
			
		userId=rs.getString("userid");	
		password=rs.getString("password");
		}
			/*System.out.println("entered "+lCust.getUserId());
			System.out.println("enytered"+lCust.getPassword());*/
			rs.close();
			stmnt.close();
			con.close();

		} catch (Exception e1) {
			e1.printStackTrace();
			System.out.println(" database connection failed during login ");
		}
		
		if (userId.equals(lCust.getUserId()) && password.equals(lCust.getPassword()))

			return true;

		else
			return false;

	}

}
