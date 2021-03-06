package com.bcj.corejava.datatypes.arrays.lab4;

import java.util.Scanner;

/**
 * @author Bootcamp User 005
 * this class is defined to calculate the exponential values for a given power and base
 *
 */
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int input=s.nextInt();
		s.close();
		for(int i=0;i<input;i++)
	  System.out.println(powerOfTwo(input)[i]);
	 
		System.out.println("enter base ");
		int base=s.nextInt();
		System.out.println("enter power");
		int power=s.nextInt();
		for(int i=0;i<power;i++)
		 System.out.println(power(base,power)[i]);

	}
	/**
	 * @param n
	 * @return powerValues
	 * takes the input parameter n calculates the exponential values for each i 
	 * and returns the values stored in the powerValues array for base 2
	 */
	public static int[] powerOfTwo(int n){
		int[] powerValues=new int[n];
		for(int i=0;i<n;i++)
		{
			powerValues[i]=(int) Math.pow(2, i);
		}
				
		return powerValues;		
	}

	
	/**
	 * @param base
	 * @param power
	 * @return results 
	 * takes the input parameters base and power 
	 * calculates the exponential values for each value of power and returns the array result
	 * 
	 */
	static int[] power(int base, int power){
		int[] result=new int[power];
		for(int i=0;i<power;i++)
		{
			result[i]=(int) Math.pow(base, i);
		}
		
		return result;
	}
}
