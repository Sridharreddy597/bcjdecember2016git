package com.bcj.ArrayList;

public class Student {
	private String StudentID;
	private String firstName;
	private String lastName;
	private String email;
	private String age;

	public String getStudentID() {
		return StudentID;
	}

	public void setStudentID(String studentID) {
		StudentID = studentID;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGrades() {
		return grades;
	}

	public void setGrades(String grades) {
		this.grades = grades;
	}

	private String grades;

	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", age=" + age + ", grades=" + grades + "]";
	}
	
}
