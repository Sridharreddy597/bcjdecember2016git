package com.bcj.corejava.operators.lab5;

import java.util.Scanner;

/**
 * @author Bootcamp User 005
 * this class is defined to check whether given number is multiple of other or not 
 *
 */
public class CheckMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter two digits");
		int number1=s.nextInt();
		int number2=s.nextInt();
		s.close();
		if(number1%number2==0)
			System.out.println("first number is multiple of second number");
		else
			System.out.println("first number is not a multiple of second number");

	}

}
