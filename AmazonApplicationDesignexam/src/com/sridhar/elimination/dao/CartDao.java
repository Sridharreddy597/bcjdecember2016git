package com.sridhar.elimination.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sridhar.elimination.modal.Cart;

public class CartDao {
		
	
	
	public void saveCart(Cart crt){

		String conneturl = "jdbc:mysql://localhost:3306/elimination";
		String gate = "root";
		String code = "root";
		java.sql.Connection con;
		PreparedStatement stmnt;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(conneturl, gate, code);
			if (con != null)
				System.out.println("connected to database elimination ");
			String sql="select price  from product where productId=?";
			 stmnt = con.prepareStatement(sql);
			stmnt.setInt(1, crt.getProductId());
			ResultSet rs = stmnt.executeQuery();
			while (rs.next()){
				 crt.setPrice(rs.getInt("price"));					
		}
			int amount=crt.getNoofitems()*crt.getPrice();
			crt.setAmount(amount);
			//System.out.println("databse check");
			
			 String sql1="INSERT INTO Cart values(?,?,?,?)";
			 stmnt = con.prepareStatement(sql1);
					 stmnt.setInt(1, crt.getCartId());
					 stmnt.setInt(2, crt.getProductId());
					 stmnt.setInt(3, crt.getNoofitems());	
					 stmnt.setInt(4, amount);	
					 stmnt.executeUpdate();					 
			System.out.println("cart saved sucessfully   ");
			
			stmnt.close();
			con.close();
		
		} catch(Exception e)
		{
		e.printStackTrace();
		System.out.println(" database connection failed during cart storage ");
		}
	
		}

}
