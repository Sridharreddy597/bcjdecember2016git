package com.bcj.creditcard;

import java.util.Scanner;

public class CreditCardController {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter first name");
	String firstName=s.nextLine();
	System.out.println("enter your last name ");
	String lastName=s.nextLine();
	System.out.println("enter your date of birth");
	String dob=s.nextLine();
	System.out.println("enter your Social Secutiry Number");
	String ssn=s.nextLine();
	System.out.println("enter your Email ");
	String email=s.nextLine();
	System.out.println("enter your mobile no");
	String mobile=s.nextLine();
	System.out.println("enter your employment status");
	String employmentStatus=s.nextLine();
	System.out.println("enter your gross income");
	double grossIncome=s.nextDouble();
	System.out.println("how much rent you pay monthly?:");
	double monthlyRentPayment=s.nextDouble();
	System.out.println("Total Available assets  you have ");
	double totalAssets=s.nextDouble();
	s.close();
	
	Applicant aplcnt=new  Applicant();
	aplcnt.setFirstName(firstName);
	aplcnt.setLastName(lastName);
	aplcnt.setDateOfBirth(dob);
	aplcnt.setSsn(ssn);
	aplcnt.setEmail(email);
	aplcnt.setMobile(mobile);
	aplcnt.setEmploymentStatus(employmentStatus);
	aplcnt.setGrossIncome(grossIncome);
	aplcnt.setMonthlyRentPayment(monthlyRentPayment);
	aplcnt.setTotalAssets(totalAssets);
	CreditCardService  ccs= new CreditCardService();
	ccs.creditCardHandler(aplcnt);
		
	}

}
