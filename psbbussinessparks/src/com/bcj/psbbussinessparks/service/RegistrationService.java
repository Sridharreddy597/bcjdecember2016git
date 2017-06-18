package com.bcj.psbbussinessparks.service;


import java.sql.SQLException;

import javax.naming.NamingException;

import com.bcj.psbbussinessparks.dao.RegistrationDao;
import com.bcj.psbbussinessparks.modal.Company;

/**
 * @author Bootcamp User 005
 * 
 *         this class deals with registration 
 */
public class RegistrationService {

	/**
	 * @param cmpny
	 * @return
	 * 		this methods saves the company details
	 */
	public boolean saveCompany(Company cmpny) {
		// TODO Auto-generated method stub
		RegistrationDao rDao = new RegistrationDao();
		try {
			try {
				return rDao.saveCompany(cmpny);
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
