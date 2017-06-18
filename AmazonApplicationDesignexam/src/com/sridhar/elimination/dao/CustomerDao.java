package com.sridhar.elimination.dao;
import java.sql.*;


import com.sridhar.elimination.modal.Customer;

public class CustomerDao {

	public void saveCustomer(Customer cust) {
		// TODO Auto-generated method stub
		
		
		String conneturl = "jdbc:mysql://localhost:3306/elimination";
		String gate = "root";
		String code = "root";
		java.sql.Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(conneturl, gate, code);
			if (con != null)
				System.out.println("connected to database elimination ");
			 String sql="INSERT INTO customer  values (?,?,?,?,?,?,?)";
			 PreparedStatement stmnt = con.prepareStatement(sql);
					 stmnt.setString(1, cust.getFirstName());
					 stmnt.setString(2, cust.getLastName());
					 stmnt.setString(3, cust.getEmail());
					 stmnt.setString(4, cust.getPhone());
					 stmnt.setString(5, cust.getUserId());
					 stmnt.setString(6, cust.getPassword());
					 stmnt.setString(7, cust.getCustomerId());
					 stmnt.executeUpdate();
			System.out.println("cutomer saved sucessfully   ");
stmnt.close();
con.close();
			/*;

			
			stmnt.execute();
			(firstName,lastName,email,phone,userid,password,customerid)

			String hold = "SELECT * FROM page WHERE name = ?";
			PreparedStatement st = con.prepareStatement(hold);
			st.setString(1, contact);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				System.out.println("retrieved name is : " + rs.getString("name"));
				System.out.println("retrieved number is : " + rs.getString("number"));
			}
*/		
	} catch(Exception e)
		{
		e.printStackTrace();
		System.out.println(" database connection failed during registration ");
		}
	
		}

}
