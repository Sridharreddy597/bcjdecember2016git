package com.bcj.corejava.operators.lab5;

import java.util.Scanner;

/**
 * @author Bootcamp User 005
 * calculates the circumference of circle
 */
public class CircumferenceOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of the circle");
		int radius = sc.nextInt();  
		sc.close();
	
		System.out.printf("Diameter = %d" ,(2 * radius));
		System.out.printf(" \nCircumfrence %.2f",(2*radius*Math.PI));
		System.out.printf(" \nArea %.2f",(Math.pow(radius, 2)*Math.PI));

	}

}
