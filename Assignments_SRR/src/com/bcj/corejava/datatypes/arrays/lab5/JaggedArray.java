package com.bcj.corejava.datatypes.arrays.lab5;

/**
<<<<<<< HEAD
 * @author Bootcamp User 005 this class is defined to store the elements in the
 *         two dimensional array and print the courses taken specific person
=======
 * @author Bootcamp User 005
 * this class is defined to store the elements in the two dimensional array
 * and print the courses taken specific person
>>>>>>> 96b5c57366ad685b6446a1c0f5a3f59608861971
 *
 */
public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		// Initialization of 2D array;
=======
      // Initialization of 2D array; 
>>>>>>> 96b5c57366ad685b6446a1c0f5a3f59608861971
		String[][] studentCourses = { { "Student Name", "Tutorial 1", "Tutorial 2", "Tutorial 3" },
				{ "Tony", "JAVA", "C", "C++" }, { "Thomas", "JAVA", "UNIX", null },
				{ "Dinil", "Linux", "Oracle", null }, { "Delvin", "RDBMS", "C#", "ORACLE", null } };
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 4; column++) {
				if (studentCourses[row][column] == "Delvin") {
					System.out.println("courses taken by delvin are :");
					// prints the courses taken by "Delvin"
					for (int colum = 1; colum < 4; colum++)
						System.out.println(studentCourses[row][colum]);
				}
			}
		}

	}

}
