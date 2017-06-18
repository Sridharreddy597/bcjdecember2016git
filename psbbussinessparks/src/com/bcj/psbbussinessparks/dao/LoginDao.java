package com.bcj.psbbussinessparks.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.bcj.psbbussinessparks.util.DBUtil;

/**
 * @author Bootcamp User 005 this class is used to retrive the data from from
 *         database that is stored and verifies the userid and password
 */
public class LoginDao {

	private String usrId;
	private String pwd;

	Connection con = null;
	PreparedStatement stmnt;

	/**
	 * @param userId
	 * @param password
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 * @throws NamingException
	 * 
	 *             this method is used to retrive the data from from database
	 *             that is stored and verifies the userid and password
	 */
	public boolean authenticateTenant(String userId, String password)
			throws SQLException, ClassNotFoundException, NamingException {
try{
		DBUtil db = new DBUtil();
		con = db.getConnectionByPropertiesFile();

		if (con != null) {
			// System.out.println("connected to database elimination ");

			PreparedStatement stmnt = con.prepareStatement("select userid , password from tenant where userid= ?");
			stmnt.setString(1, userId);

			ResultSet rs = stmnt.executeQuery();
			while (rs.next()) {
				usrId = rs.getString("userid");
				pwd = rs.getString("password");
			}
			rs.close();
		}
			
		}finally{
			

			//con.close();
		}

		if ((usrId.equals(userId)) && (pwd.equals(password))) {
			return true;
		} else
			return false;
	}
}
