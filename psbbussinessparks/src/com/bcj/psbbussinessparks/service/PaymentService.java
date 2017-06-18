package com.bcj.psbbussinessparks.service;

import java.io.IOException;

import com.bcj.psbbussinessparks.dao.PaymentDao;
import com.bcj.psbbussinessparks.modal.Payment;

/**
 * @author Bootcamp User 005 this class is used to carry the payment details to
 *         dao class
 */
public class PaymentService {

	/**
	 * @param pymnt
	 * @return
	 * this method deals with authentication of payment details given by user 
	 */
	public boolean verifyPayment(Payment pymnt) {
		// TODO Auto-generated method stub		
		
		PaymentDao pDao = new PaymentDao();

		try {
			return pDao.verifyPayment(pymnt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
