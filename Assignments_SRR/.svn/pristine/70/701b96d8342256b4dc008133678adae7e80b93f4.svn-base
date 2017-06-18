package com.bcj.corejava.oops.classes.simple.src.com.joker.sridhar.lab4;

/**
 * @author Bootcamp User 005
 * this class is a student entity class which stores the student details 
 * all the instant values of student are intialized by setters
 * 
 *
 */
public class Student {
	private int studentId;
	private float qualifyingExamMarks;
	private char residentialStatus;
	private int yearOfEngg;
	private String studentName;
	private   String branchName;
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public  boolean validateStudentName(){
		if (studentName.length()>=5 && studentName.length()<=25)
			return true;
		else {
			System.out.println("The length of the name should be minimum 5 characters and a maximum of 25 characters");
		}
		return false;
	}
	public  boolean validatebranchName()
	{ if("cse".equalsIgnoreCase(branchName)||"ece".equals(branchName)||"eee".equals(branchName)||"mech".equals(branchName)||"bio-tech".equals(branchName))
		return true;
	else
		System.out.println("Invalid Branch Name, set to CSE");
		return false;
	}
	



	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}


	public void setQualifyingExamMarks(float qualifyingExamMarks) {
				this.qualifyingExamMarks = qualifyingExamMarks;
	}


	public char getResidentialStatus() {
		return residentialStatus;
	}


	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}


	public int getYearOfEngg() {
		return yearOfEngg;
	}


	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}

}
