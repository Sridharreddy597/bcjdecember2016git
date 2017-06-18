package com.bcj.corejava.operators.lab5;

import java.util.Scanner;

/**
 * @author Bootcamp User 005
 * this class is defined to calculate sum difference product and division of two numbers 
 * given by the user
 *
 */
public class SumProductDifferenceQuotient {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter any 2 integers");
		double number1 =s.nextInt();
		double number2=s.nextInt();
		s.close();
		System.out.println("sum is "+(int)(number1+number2)); // prints the sum  of two numbers
		System.out.println("product is "+(int)(number1*number2));// prints the product of two numbers
		System.out.println("difference is "+(int)(number1-number2)); // prints the difference of two numbers
		System.out.println("quotient is "+(number1/number2)); // prints the quotient

	}

}
