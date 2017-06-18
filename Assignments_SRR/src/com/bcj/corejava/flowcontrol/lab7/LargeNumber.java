package com.bcj.corejava.flowcontrol.lab7;

import java.util.Scanner;

/**
 * @author Bootcamp User 005
 * the given below declared class takes the input from the user and directly compares 
 * and prints the largest number 
 */
public class LargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//System.out.println("enter the total size of the array");
		
		//int number=s.nextInt();
		System.out.println("enter 10 numbers");
		int largestNumber=0;
		
for(int counter=0;counter<10;counter++)
{   
   int inputValue=s.nextInt();
		   if(inputValue>largestNumber)
		   largestNumber=inputValue;
		  
		   
}
s.close();
System.out.println("the largest number is : "+largestNumber);

	}
	

}
