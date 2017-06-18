package com.bcj.ead;

import java.util.Scanner;

public class EadController {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter your full name ");
		String fullName = s.nextLine();
		System.out.println("enter your date of birth in the format of  MM/DD/YYYY");
		String dateOfBirth = s.nextLine();
		System.out.println("enter your gender");
		String gender = s.nextLine();
		System.out.println("enter  your ssn no.");
		String ssn = s.nextLine();
		System.out.println("enter  your nationality.");
		String nationality = s.nextLine();
		s.close();
		ApplicantInfo ai = new ApplicantInfo();
		ai.setFullName(fullName);
		ai.setDateOfBirth(dateOfBirth);
		ai.setGender(gender);
		ai.setSsn(ssn);
		ai.setNationality(nationality);
		
		EadService obj = new EadService();
		obj.eadHandler(ai);
	}	    
	}

