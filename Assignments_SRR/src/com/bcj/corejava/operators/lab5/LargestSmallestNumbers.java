package com.bcj.corejava.operators.lab5;

import java.util.Scanner;

public class LargestSmallestNumbers {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter 5 integers ");
		int max=0;
		int[] numberArray=new int[5];
		for(int index=0;index<5;index++)
		{
			numberArray[index]=s.nextInt();			
		}
		s.close();
		for(int index=0;index<5;index++){
		if(numberArray[index]>max)
			max=numberArray[index];
		else{}
	}
		System.out.println("largest no is "+max);
		int min=max;
		for(int index=0;index<5;index++){
			if(numberArray[index]<min)
				min=numberArray[index];
			else{}
		}
		System.out.println("smallest no is "+min);
		
		

	}

}
