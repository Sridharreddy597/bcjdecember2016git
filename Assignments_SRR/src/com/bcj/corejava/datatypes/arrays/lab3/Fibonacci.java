package com.bcj.corejava.datatypes.arrays.lab3;

import java.util.Scanner;

public class Fibonacci {

	/**
	 * @param args
	 * this class is defined to print the fibonacci series
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter n");
		
		// takes the input from the user
		int n=s.nextInt();
		int array[]= fib(n);
		for(int index=0;index<array.length;index++)
System.out.println(array[index]);
		s.close();
	}
	/**
	 * @param here the function takes the arugument as integer given by user
	 * calculates the fibonacci sequence of numbers and stores in the array
	 * @returnit returns the values stored array
	 */
	static int[] fib(int n){
		{    			
			 int n1=0,n2=1,n3,i;   int k=0; 
			 int[] fibArray= new int[n-1];				    
			 for(i=2;i<n+1;++i)//loop starts from 2 because 0 and 1 are already printed    
			 {    
			  n3=n1+n2;    
			  fibArray[k]=n3;
			  k++;			  
			  n1=n2;    
			  n2=n3; 			  
			 }   
			 return fibArray;
	}
	}
}

