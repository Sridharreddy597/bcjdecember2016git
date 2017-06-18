package com.bcj.corejava.operators.lab5;

import java.util.Scanner;

/**
 * @author Bootcamp User 005
 * this class is defined to  take the input from user and prints the larger number 
 *
 */
public class LargerOrEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter two integers");
		int number1=s.nextInt();
		int number2=s.nextInt();
		s.close();
		if(number1>number2)
			System.out.printf("%d  is larger",number1);
		else if(number1==number2)
			System.out.println("These numbers are equal ");
		else
			System.out.printf("%d is larger ",number2);
		

	}

}
