package com.bcj.corejava.oops.classes.medium.lab2;

/**
 * @author Bootcamp User 005
 * this is an employee entity class 
 * defined to store temporary employee data 
 *
 */
public class Employee {
private  String firstName;
private  String lastName;
private  double salary;

/**
 * it is a constructor 
 * which intializes instant variables with default values 
 */
Employee(){
	
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public double getSalary() {
	return salary;
}

public void setSalary(double  salary) {
	this.salary = salary;
}



}
