package com.bcj.creditcard;

public class CreditCardDao {

	public void display(Applicant aplcnt) {
		// TODO Auto-generated method stub
		
		if(aplcnt.isCreditCardStatus()){
		
		System.out.println("your credit card is approved  :");

		System.out.println("your credit limit is :"+aplcnt.getCreditlimit());
		}
		
		else{
			System.out.println("your credit card application is rejected ");
			
		}
		
	}
	
	
	
	
	
	
	
	

	
}
