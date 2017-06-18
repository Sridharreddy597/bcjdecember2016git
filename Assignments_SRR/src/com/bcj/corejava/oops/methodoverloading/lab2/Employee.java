package com.bcj.corejava.oops.methodoverloading.lab2;

import java.sql.Date;

public class Employee {

	
	private String firstName;
	private String lastName;
	private int employeeId;
	private Date dateOfBirth;
	
	
	Employee(String firstName){
		this.firstName=firstName;
			
	}
	Employee(String firstName,String lastName)
	{
		this(firstName);
		this.lastName=lastName;
	}
	Employee(String firstName, String lastName, int employeeId)
	{
		this(firstName,lastName);
		this.employeeId=employeeId;
	}
	
	Employee(String firstName, String lastName, int employeeId, Date dateOfBirth)
	{
		this(firstName,lastName,employeeId);
		this.dateOfBirth=dateOfBirth;
	}
	public   void print(){
		System.out.println("first Name : "+firstName+"\n"+"last Name :"+lastName+"\n"+"employee id :"+employeeId+"\n"+"Date :"+dateOfBirth);
	}
}
