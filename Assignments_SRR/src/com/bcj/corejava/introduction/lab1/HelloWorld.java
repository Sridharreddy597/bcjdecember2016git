package com.bcj.corejava.introduction.lab1;

public class HelloWorld {

	public static void main(String[] args) {  /*pass the arguments first name,
	                                                last name,age at run time*/ 
		// TODO Auto-generated method stub
		String fName = args[0];
		String lName = args[1];		
		int age = Integer.parseInt(args[2]);
		System.out.println("First Name is :"+fName);
		System.out.println("Last Name is :"+lName);
		System.out.println("Age is       :"+age);

	}

}
