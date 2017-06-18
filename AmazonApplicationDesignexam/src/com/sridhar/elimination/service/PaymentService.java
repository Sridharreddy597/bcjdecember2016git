package com.sridhar.elimination.service;

import com.sridhar.elimination.dao.PaymentDao;
import com.sridhar.elimination.modal.Payment;

public class PaymentService {

	public boolean processPayment(Payment pymnt) {
		PaymentDao pDao = new PaymentDao();
		Payment pSrvc = pDao.processPayment(pymnt);

		if (pymnt.getCcNumber1().equals(pSrvc.getCcNumber1()) && pymnt.getName().equals(pSrvc.getName())
				&& pymnt.getCvv() == pSrvc.getCvv() && pymnt.getAmount() < pSrvc.getAmount())
			return true;
		else
			return false;
	}
}
