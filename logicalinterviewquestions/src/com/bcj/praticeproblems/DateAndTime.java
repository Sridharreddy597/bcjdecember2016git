package com.bcj.praticeproblems;

import java.time.LocalDate;

public class DateAndTime {
	
	
	public static void main(String[] args) {
		
		String month="02";
		String day="12";
		String year="2012";
		
		//LocalDate ld = LocalDate.of(2015, 12, 31);
		
		LocalDate ldt=LocalDate.now();
		System.out.println(ldt);
		System.out.println(ldt.getDayOfWeek());
				
		//System.out.println(ld.getDayOfMonth());
		
	}
	
	
	

}
