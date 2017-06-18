package com.bcj.corejava.operators.lab5;

import java.util.Scanner;

/**
 * @author Bootcamp User 005 
 * this class is defined to print the input taken by user with spaces
 *
 */
public class NumbersWithSpaces {

	/**
	 * @param 
	 * here the main  method takes the input from the user through scanner 
	 * calculates the  individual digits of number and prints the stored numbers  with spaces
	 */
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("enter the number ");
		int input=s.nextInt();
		s.close();
	if(input>=99999 && input<10000){
		
		System.out.println("");
		 int rem[] = new int[5];
		 int index=0;
		 
		while(input>0)
		{
			int remainder=0;
			remainder=input%10;
			input=input/10;
			rem[index]=remainder;
			index++;			
		}
		for(int remindex=rem.length-1;remindex>=0;remindex--)
		System.out.print(rem[remindex]+"   ");
		
	}else System.out.println("entered no is greater or lessthan 5 digits");
	}


}
