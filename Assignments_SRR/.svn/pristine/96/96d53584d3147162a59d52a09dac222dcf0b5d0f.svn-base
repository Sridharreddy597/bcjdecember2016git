/**
 * 
 */
package com.bcj.corejava.flowcontrol.lab6;

import java.util.Scanner;

/**
 * @author Bootcamp User 005
 *
 */
public class CustomerBankInformation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the account number");
		int accountNumber=s.nextInt();
		System.out.println("enter the begining balance of the month1");
		int beginingBalnce=s.nextInt();
		System.out.println("enter the total amount charged by the customer for his items he bought");
		int charge=s.nextInt();
		System.out.println("enter the total credits applied to the customer's account this month");
		int creditForThisMonth=s.nextInt();
		System.out.println("enter the allowed credit limit ");		
		int allowedCredit=s.nextInt();
		int newBalance= beginingBalnce+charge-creditForThisMonth;
		System.out.println();
		s.close();
		if(newBalance>allowedCredit)
			System.out.println("Credit limit exceeded");	
		else 
			System.out.println("transaction approved");

	}

}
