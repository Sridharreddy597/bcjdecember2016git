package com.bcj.corejava.operators.lab5;

import java.util.Scanner;

/**
 * @author Bootcamp User 005
 *
 */
public class StringWithSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("enter the 5 digit  number ");
		int input=s.nextInt();
		s.close();
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
		

	}

}
