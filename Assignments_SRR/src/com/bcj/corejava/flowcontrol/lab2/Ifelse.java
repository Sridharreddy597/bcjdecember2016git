package com.bcj.corejava.flowcontrol.lab2;

import java.util.Scanner;

/**
 * @author Bootcamp User 005 displays the person is passed or failed according
 *         to marks he secured
 *
 */
public class Ifelse {//comments 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the marks ");
		int marks = s.nextInt();
		s.close();
		if (hasPassed(marks) == true) {
			System.out.println("passed succesfully");
		} else
			System.out.println("failed");

	}

	static boolean hasPassed(int marks) {
		int qualifyingExamMarks = marks;
		if (qualifyingExamMarks >= 65 && qualifyingExamMarks <= 100)
			return true;
		else
			return false;
	}
}
