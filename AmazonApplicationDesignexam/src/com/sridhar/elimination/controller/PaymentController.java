package com.sridhar.elimination.controller;

import com.sridhar.elimination.modal.Payment;
import com.sridhar.elimination.service.PaymentService;

public class PaymentController {

	
	public boolean  processPayment(Payment pymnt){
		PaymentService pSrvc= new PaymentService();
		
		
		return pSrvc.processPayment(pymnt);
		
	}
}
