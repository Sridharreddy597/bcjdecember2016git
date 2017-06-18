package com.bcj.creditcard;

public class CreditCardService {
	
	public void creditCardHandler(Applicant aplcnt) {
		// TODO Auto-generated method stub

double  grossIncome=aplcnt.getGrossIncome();
		if(grossIncome>50000 && grossIncome<100000)
		{
			aplcnt.setCreditlimit(2000);
			aplcnt.setCreditCardStatus(true);
		}
		else if(grossIncome>100000)
		{
			aplcnt.setCreditlimit(5000);
			aplcnt.setCreditCardStatus(true);
		}
		
		else{
			aplcnt.setCreditlimit(0);
			aplcnt.setCreditCardStatus(false);
			
		}
		CreditCardDao ccd=new CreditCardDao();
		ccd.display(aplcnt);
		
		
		
		
	}
		
	
	
	
	
}
