package com.bcj.corejava.oops.classes.medium.lab4;

import com.bcj.corejava.oops.classes.simple.src.com.joker.sridhar.lab4.Student;

/**
 * @author Bootcamp User 005
 * this class is defined to describe the usage of setters and getters  to
 *  intialize the values to instant variables of entity class 
 * method calling  
 *
 */
public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentOne = new Student();
		studentOne.setStudentId(1001);
		studentOne.setStudentName("Jackson");
		studentOne.setQualifyingExamMarks(95.0f);
		studentOne.setResidentialStatus('D');
		studentOne.setYearOfEngg(2);
		studentOne.setBranchName("CSE");
		System.out.println(studentOne.validateStudentName());
		System.out.println(studentOne.validatebranchName());
		if (studentOne.getQualifyingExamMarks() < 65)
			System.out.println("Invalid marks, the range of marks is between 65 and 100 ");
		else {
			System.out.println("student id           "
					+ "  : " + studentOne.getStudentId() + "\n" + "student name                : "
					+ studentOne.getStudentName() + "\n" + "qualifyingExam Marks        : "
					+ studentOne.getQualifyingExamMarks()+"\n" + "Residential status          : " + studentOne.getResidentialStatus()
					+ "\n" + "current Year of engineering : " + studentOne.getYearOfEngg() + "\n" + "Branch name                 : "
					+ studentOne.getBranchName());
			
			
			
			
			

			Student studentTwo = new Student();
			studentTwo.setStudentId(1002);
			studentTwo.setStudentName("jen");
			studentTwo.setQualifyingExamMarks(68.0f);
			
			studentTwo.setResidentialStatus('H');
			studentTwo.setYearOfEngg(3);
			studentTwo.setBranchName("ABC");
			System.out.println(studentTwo.validateStudentName());
			System.out.println(studentTwo.validatebranchName());
			if (studentTwo.getQualifyingExamMarks() < 65)
				System.out.println("Invalid marks, the range of marks is between 65 and 100 ");
			else {
				System.out.println("student id            "
						+ "     : " + studentTwo.getStudentId() + "\n" + "student name                : "
						+ studentTwo.getStudentName() + "\n" + "qualifyingExam Marks        : "
						+ studentTwo.getQualifyingExamMarks()+"\n" + "Residential status          : " + studentTwo.getResidentialStatus()
						+ "\n" + "current Year of engineering : " + studentTwo.getYearOfEngg() + "\n" + "Branch name                 : "
						+ studentTwo.getBranchName());

			}


		}

	}

}
