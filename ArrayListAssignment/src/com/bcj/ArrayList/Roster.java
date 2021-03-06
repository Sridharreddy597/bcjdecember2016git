package com.bcj.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

public class Roster {

	/**
	 * @param studentid
	 * @param stdnt
	 *            this method is defined to remove the specific student given by
	 *            user form the student <arraylist> this method takes the input
	 *            parameter student <arraylist> and student id
	 */
	public static void remove(String studentid, ArrayList<Student> stdnt) {
		Iterator<Student> itr = stdnt.iterator();
		int size = stdnt.size();
		while (itr.hasNext()) {
		 itr.remove();
			
				System.out.println(" student removed sucessfully");
			}
		
		if (stdnt.size() == size) {
			System.out.println("Student Id you entered is not found!");
		}

	}

	/**
	 * @param stdnt
	 *            this method takes the input parameter <student> <arraylist>
	 *            and print all the student values by tab spaces in each line
	 */
	public static void print_all(ArrayList<Student> stdnt) {
		Iterator<Student> itr = stdnt.iterator();
		while (itr.hasNext()) {
			Student obj = itr.next();

			System.out.println("student firstName : " + obj.getFirstName() + "\t" + "lastName : " + obj.getLastName()
					+ "\t" + "age : " + obj.getAge() + "\t" + "grades : " + obj.getGrades() + "\n");
		}
	}

	/**
	 * @param studentid
	 * @param stdnt
	 *            this method takes the input parameter student array list and
	 *            the student id for the specific student and print the average
	 *            grades of that specific student
	 */
	public static void print_average_grade(String studentid, ArrayList<Student> stdnt) {
		// TODO Auto-generated method stub
		Iterator<Student> itr = stdnt.iterator();
		while (itr.hasNext()) {
			Student obj = itr.next();
			if (obj.getStudentID().equals(studentid)) {
				String grades[] = obj.getGrades().split(",");
				int marks = Integer.parseInt(grades[0]) + Integer.parseInt(grades[1]) + Integer.parseInt(grades[2]);
				int avg = marks / 3;
				System.out.println("average marks are : " + avg);

			}

		}

	}

	/**
	 * @param stdnt
	 *            this method takes the input parameter student array list and
	 *            checks for the invalid email id's and prints them
	 */
	public static void print_invalid_emails(ArrayList<Student> stdnt) {
		// TODO Auto-generated method stub
		Iterator<Student> itr = stdnt.iterator();
		while (itr.hasNext()) {
			Student obj = itr.next();
			String email = obj.getEmail();
			// System.out.println(Pattern.matches("*[@]*[\\.]*",
			// obj.getEmail()));
			System.out.println("the invalid email id's are ");
			if (!Pattern.matches("[a-zA-Z0-9\\._]*[@][a-zA-Z0-9]*[\\.][a-zA-Z0-9]*", email)) {

				System.out.println(email);
			}

		}

	}

}
