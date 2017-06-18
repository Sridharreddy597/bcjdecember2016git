package com.bcj.psbbussinessparks.service;

import java.sql.SQLException;

import javax.naming.NamingException;

import com.bcj.psbbussinessparks.dao.LoginDao;

/**
 * @author Bootcamp User 005 this class is used to verify the given user details
 *        from the database 
 */
public class LoginService {
	/**
	 * @param userId
	 * @param password
	 * @return this method returns true or false based on given details matches
	 *         or not
	 */
	public boolean authenticateTenant(String userId, String password) {
		LoginDao lDao = new LoginDao();

		try {
			try {
				/**
				 * calls the authenticate method of login dao class
				 */
				return lDao.authenticateTenant(userId, password);
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
