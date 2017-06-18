package com.sridhar.elimination.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sridhar.elimination.modal.Product;

public class ProductDao {

	public ArrayList<Product>  getproduct(){
		
		ArrayList <Product> pdtAl= new ArrayList<Product>();	
		String conneturl = "jdbc:mysql://localhost:3306/elimination";
		String gate = "root";
		String code = "root";
		
		java.sql.Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(conneturl, gate, code);
			if (con != null)
				System.out.println("connected to database elimination ");
			String sql = "select *  from  product";
			PreparedStatement stmnt = con.prepareStatement(sql);
					
			ResultSet rs = stmnt.executeQuery();
			
			while(rs.next()){
			Product prdct =new Product();
			prdct.setProductId(rs.getString(1));
			prdct.setProductName(rs.getString(2));
			prdct.setPrice(rs.getString(3));
			pdtAl.add(prdct);
			
		//rs.getString("password");
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
		return pdtAl;
		
		
	}

}
