package com.bcj.ssn;

import java.util.Scanner;

public class SsnController {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		ApplicantDetails ap = new ApplicantDetails();
		System.out.println("enter your first name ");
		String firstName = s.nextLine();
		System.out.println("enter your last name");
		String lastName = s.nextLine();
		System.out.println("enter your date of birth in the format of  MM/DD/YYYY");
		String dateOfBirth = s.nextLine();
		System.out.println("enter your gender");
		String gender = s.nextLine();
		System.out.println("enter  your passport no.");
		String passportNumber = s.nextLine();
		s.close();
		ap.setFirstName(firstName);
		ap.setLastName(lastName);
		ap.setDateOfBirth(dateOfBirth);
		ap.setGender(gender);
		ap.setPassportNumber(passportNumber);
		
		SsnService ssnservice=new SsnService();
		ssnservice.ssnGenerator(ap);

	}
}
