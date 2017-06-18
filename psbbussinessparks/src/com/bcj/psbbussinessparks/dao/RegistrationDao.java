package com.bcj.psbbussinessparks.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.bcj.psbbussinessparks.modal.Company;
import com.bcj.psbbussinessparks.util.DBUtil;

/**
 * @author Bootcamp User 005 this class is used to connect to database and store
 *         the values into database
 */
public class RegistrationDao {
	int addressId;
	int tenantId;
	int rows=0;
	Connection con = null;
	PreparedStatement stmnt;
	PreparedStatement ps1;
	PreparedStatement ps2;
	// PreparedStatement stmnt;

	/**
	 * @param cmpny
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws NamingException
	 *             this method saves the details of company into database
	 */
	public boolean saveCompany(Company cmpny) throws ClassNotFoundException, SQLException, NamingException {
		// TODO Auto-generated method stub
		// System.out.println(cmpny);

		/***
		 * this creates an object of dbutil class and calls the method
		 * getconnectionByPropereties for loading the mysql driver
		 */
		try{
		DBUtil db = new DBUtil();
		con = db.getConnectionByPropertiesFile();

		// TODO Auto-generated method stub
	
		if (con != null) {
			System.out.println("connected to database psb ");
			
			/*
			 * prepared statement is used the execute the sql queries and insert
			 * the data into tenant table
			 */
			stmnt = con.prepareStatement(
					"INSERT INTO tenant (firstName, lastName, phone, email,userid,password) values (?,?,?,?,?,?)",
					PreparedStatement.RETURN_GENERATED_KEYS);

			stmnt.setString(1, cmpny.getTnt().getFirstName());
			stmnt.setString(2, cmpny.getTnt().getLastName());
			stmnt.setString(3, cmpny.getTnt().gettPhone());
			stmnt.setString(4, cmpny.getTnt().gettEmail());
			stmnt.setString(5, cmpny.getTnt().gettUserId());
			stmnt.setString(6, cmpny.getTnt().gettPassword());

			stmnt.executeUpdate();
			
			// System.out.println("cutomer saved sucessfully ");
			/**
			 * result sets is used to retrieve the data from database
			 */
			ResultSet rs = stmnt.getGeneratedKeys();
			while (rs.next()) {
				tenantId = (rs.getInt(1));
			}
			// stmnt.close();
			
			/*
			 * prepared statement is used the execute the sql queries and insert
			 * the data into address table
			 */
			ps1 = con.prepareStatement(
					"INSERT INTO address (addressLine1,addressLine2,city,state,zip)  values (?,?,?,?,?)",
					PreparedStatement.RETURN_GENERATED_KEYS);

			ps1.setString(1, cmpny.getAdd().getAddressLine1());
			ps1.setString(2, cmpny.getAdd().getAddressLine2());
			ps1.setString(3, cmpny.getAdd().getCity());
			ps1.setString(4, cmpny.getAdd().getState());
			ps1.setString(5, cmpny.getAdd().getZip());
			// stmnt.setString(7, cmpny.getTnt().gettPassword());

			 ps1.executeUpdate();
			// System.out.println("cutomer saved sucessfully ");
			 
			ResultSet rs1 = ps1.getGeneratedKeys();			
			while (rs1.next())
				addressId = (rs1.getInt(1));

			// ps1.close();
			/*
			 * prepared statement is used the execute the sql queries and insert
			 * the data into tenant table
			 */

			ps2 = con.prepareStatement("INSERT INTO company (companyName,phone,email,A_id, t_id)  values (?,?,?,?,?)",
					PreparedStatement.RETURN_GENERATED_KEYS);

			ps2.setString(1, cmpny.getCompanyName());
			ps2.setString(2, cmpny.getPhone());
			ps2.setString(3, cmpny.getEmail());
			ps2.setInt(4, addressId);
			ps2.setInt(5, tenantId);

			// stmnt.setString(7, cmpny.getTnt().gettPassword());

			rows = ps2.executeUpdate();
			// System.out.println("cutomer saved sucessfully ");
			
			ResultSet rs2 = ps2.getGeneratedKeys();
			while (rs2.next())
				cmpny.setCompanyId(rs2.getInt(1));

			// ps2.close();
			
		}

		}
		finally{
			//stmnt.close();
			//con.close();
		}
		if (rows!=0)
			return true;
		else
			return false;
	}

}
