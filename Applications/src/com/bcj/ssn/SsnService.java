package com.bcj.ssn;

import java.util.Random;

public class SsnService {

	public void ssnGenerator(ApplicantDetails apd) {
		Random rand = new Random();

		int randomNum = 100 + rand.nextInt(900);
		String firstThreeDigits = Integer.toString(randomNum);
		int randNum2 = 10 + rand.nextInt(90);
		String secondTwoDigits = Integer.toString(randNum2);
		int randNum3 = 1000 + rand.nextInt(9000);
		String lastFourDigits = Integer.toString(randNum3);
		String ssn = firstThreeDigits + "-" + secondTwoDigits + "-" + lastFourDigits;
		
		apd.setSsn(ssn);
		
		SsnDao sd=new SsnDao();
		sd.ssnDisplay(apd);
	}
}
