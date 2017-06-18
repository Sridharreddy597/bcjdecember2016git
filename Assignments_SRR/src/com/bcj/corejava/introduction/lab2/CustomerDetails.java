package com.bcj.corejava.introduction.lab2;

import java.util.Scanner;

public class CustomerDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);	
		System.out.println("enter first name of the customer");
		String fName = s.next();
		System.out.println("enter last name of the customer");
		String lName = s.next();
		System.out.println("enter age of the customer");
		int age = s.nextInt();
		s.close();
		System.out.println("First Name is :"+fName);
		System.out.println("Last Name is  :"+lName);
		System.out.println("Age is        :"+age);


	}

}
