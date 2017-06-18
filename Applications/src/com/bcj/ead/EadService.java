package com.bcj.ead;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class EadService {
	public void eadHandler(ApplicantInfo obj) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int randomNum = 100 + rand.nextInt(900);
		String firstThreeDigits = Integer.toString(randomNum);
		int randomNum2 = 100 + rand.nextInt(900);
		String secondThreeDigits = Integer.toString(randomNum2);
		int randomNum3 = 100 + rand.nextInt(900);
		String lastThreeDigits = Integer.toString(randomNum3);
		String eadUscisNo = firstThreeDigits + "-" + secondThreeDigits + "-" + lastThreeDigits;
		//ApplicantInfo aio=new ApplicantInfo();
		obj.setEadUscisNo(eadUscisNo);
		Date date = new Date();
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    cal.add(Calendar.YEAR , 1);

	        Date expirationDate = cal.getTime();
	        SimpleDateFormat fdt = new SimpleDateFormat("MM/dd/yyyy");
	        String enddate=fdt.format(expirationDate);
	        obj.setExpirationDate(enddate);
	        
	        Date dNow = new Date();
	    	SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy");
	    	String startDate=ft.format(dNow);
	    	obj.setStartDate(startDate);
		
		EadDao eadDao = new EadDao();
		eadDao.displayEADDetails(obj);
	

	}

}
