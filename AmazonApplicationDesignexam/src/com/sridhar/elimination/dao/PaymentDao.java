package com.sridhar.elimination.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sridhar.elimination.modal.Payment;

public class PaymentDao {

	String conneturl = "jdbc:mysql://localhost:3306/elimination";
	String gate = "root";
	String code = "root";
	Connection con = null;

public Payment processPayment(Payment pyt){
	

	Payment pymt=new Payment();

	try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(conneturl, gate, code);
		if (con != null)
			System.out.println("connected to database elimination ");
		String sql="select * from payment where ccNumber= ? ";
		PreparedStatement stmnt = con.prepareStatement(sql);
		stmnt.setString(1,pyt.getCcNumber1());
		
		ResultSet rs = stmnt.executeQuery();
		while (rs.next()){
			 pymt.setCcNumber1(rs.getString("ccNumber"));
			 pymt.setName(rs.getString("Name"));
	 		 pymt.setCvv(rs.getInt("cvv"));
	 		 pymt.setAmount(rs.getInt("amount"));
	 		 
		}
}
	 catch(Exception e)
	{
	e.printStackTrace();
	System.out.println(" database connection failed during payment ");
	}
	
	return pymt;
}
}

