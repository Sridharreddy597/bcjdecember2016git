package com.bcj.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentController {

	public static void main(String[] args) {
		ArrayList<Student> stdnt = new ArrayList<Student>();
		for (int i = 0; i < 5; i++) {
			StudentController sctrl = new StudentController();
			
			stdnt.add(sctrl.getStudentDetails());
		}

		Scanner s = new Scanner(System.in);
		// StudentService stdsrc=new StudentService();

		/*
		 * System.out.println("enter the student values that you want to print"
		 * ); stdsrc.print(s.nextInt(), stdnt);
		 */
		Roster.print_all(stdnt);
		
		Roster.print_invalid_emails(stdnt);
		for (int i = 0; i < 2; i++) {
			System.out.println("enter the student id that you want to remove");
			String student = s.nextLine();
			Roster.remove(student, stdnt);

		}
		System.out.println("enter the student id that you want to get average grades ");
		String studentid = s.nextLine();
		Roster.print_average_grade(studentid, stdnt);
		Roster.print_all(stdnt);
		s.close();
	}

	/**
	 * @param i
	 * @param stdnt
	 *            this method is defined to print the specific student values
	 *            given by user 
	 * 
	 */
	private void print(int i, ArrayList<Student> stdnt) {
		// TODO Auto-generated method stub
		if (i < 2) {
			System.out.println("student id " + stdnt.get(i).getStudentID());
			System.out.println("first name " + stdnt.get(i).getFirstName());
			System.out.println("student id " + stdnt.get(i).getLastName());
		} else {
			System.out.println("entered student id does not exist ");
			System.out.println("enter the student values that you want to print");
			Scanner s = new Scanner(System.in);
			print(s.nextInt(), stdnt);
		}
	}

	/**
	 * @return this method is defined to to take the input values of each
	 *         student and returns the student object
	 */
	private Student getStudentDetails() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		System.out.println("enter student id");
		std.setStudentID(sc.nextLine());
		System.out.println("enter first name of student");
		std.setFirstName(sc.nextLine());
		System.out.println("enter last name of student ");
		std.setLastName(sc.nextLine());
		System.out.println("enter the email of student");
		std.setEmail(sc.nextLine());
		System.out.println("enter the age of student");
		std.setAge(sc.nextLine());
		System.out.println("enter only 3test scores of the student in the form of (marks,marks,marks)");
		std.setGrades(sc.nextLine());
		return std;
	}
}
