package com.bcj.corejava.operators.lab5;

import java.util.Scanner;

/**
 * @author Bootcamp User 005
 * this class is created to take 3 numbers as the input from the user 
 *  calculate and and print the sum avg and product of the given numbers
 * 
 *
 */
public class SumAvgProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//sum, average, product, smallest and largest of the numbers.
		Scanner s= new Scanner(System.in);
		System.out.println("enter 3 integers");
		//creates array of size 3
		int[] inputArray=new int[3];
		for(int arrayIndex=0;arrayIndex<inputArray.length;arrayIndex++)
			//takes the input of three numbers and stores it in the inputArray
			inputArray[arrayIndex]=s.nextInt();
	int sum=0;int product=1;int largest=0;
	s.close();
	for(int arrayIndex=0;arrayIndex<inputArray.length;arrayIndex++)
	{
		sum=sum+inputArray[arrayIndex];//calculates the sum
		product=inputArray[arrayIndex]*product;//calculates the product
		if(inputArray[arrayIndex]>largest)
			largest=inputArray[arrayIndex];				
	}
	System.out.println("sum of 3 numbers is         :"+sum);
	int avg=sum/3;
	
	System.out.println("average of three numbers is :"+avg);
	System.out.println("the largest of 3 numbers is :"+largest);	
	System.out.println("product of 3 numbers is     :"+product);
	int smallest =largest;
	for(int arrayIndex=0;arrayIndex<inputArray.length;arrayIndex++)
	{
		if(inputArray[arrayIndex]<smallest)
		smallest=inputArray[arrayIndex];	
		
	}
	System.out.println("the smallest of three numbers is:"+smallest);
	

}
}