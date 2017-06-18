package com.bcj.ssn;

public class SsnDao {

	void ssnDisplay(ApplicantDetails apd) {
		
		System.out.println("your details are ");
		System.out.println("First Name  :" + apd.getFirstName());
		System.out.println("Last Name   :" + apd.getLastName());
		System.out.println("Date of Birth:" + apd.getDateOfBirth());
		System.out.println("gender      :" + apd.getGender());
		System.out.println("pasport number :" + apd.getPassportNumber());
		System.out.println("your ssn is :" + apd.getSsn());

	}
}
