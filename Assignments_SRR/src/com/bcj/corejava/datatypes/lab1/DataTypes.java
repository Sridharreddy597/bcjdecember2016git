/**
 * 
 */
package com.bcj.corejava.datatypes.lab1;

import java.util.Scanner;

/**
 * @author Bootcamp User 005
 *
 */
public class DataTypes {

	
	/**
	 * @param args
	 */
	// double sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		double numbers[]={10,40,142.5,333.62};
		double sum=0;
		for(int i=0;i<4;i++){
		  sum=sum+numbers[i];
		}
		System.out.println("the addition of 10,40,142.5,333.62 is"+sum);
		int a=45, b =-21;
		int sum1=a+b;
		System.out.println("the addition of"+a+" and "+b+" is"+sum1);
		String str="hello how are you";
		System.out.println("the stored string is "+str);
		char c='H';
		System.out.println("the stored char is "+c);
		int  p=21;
		long q=(long)p;
		System.out.println("the upcasted integer to long is "+q+"\n");
		
		int r=(int)q;
		System.out.println("the downcasted long to integer is "+r+"\n");
		 int arrayOfTen[]={1,1,1,1,1,1,1,1,1,1};
		 System.out.println("stored 10 integers in array is");
		 for(int i=0;i<10;i++){
		 System.out.println(" "+arrayOfTen[i]);
		 }
		 
		 char alphabets[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		 System.out.println("stored alphabets in character array is ");
		 for(int i=0;i<26;i++)
		 {
			 
			 System.out.println(""+alphabets[i]);}
		 		 
 int array2d[][]=new int[7][5];
 System.out.println("enter 35 elements in to 2d array");
 int row=0,column=0;
 for(row=0;row<7;row++)
 {for(column=0;column<5;column++)	{
	array2d[row][column] = s.nextInt(); 
 }
	}
	
	for(row=0;row<7;row++)
	 {for(column=0;column<5;column++)	{	
			System.out.println(" entered 35 elements in the 2D array is :"+array2d[row][column]);
	 
		 }
	
	}
 String st="10";
 int num=Integer.parseInt(st);
System.out.println("parsed string to int is :"+num);
System.out.println("Reviews:\n"+"Total: 9 hrs\n"+"Attended Core Java class(5hrs).");
System.out.println("completed few of the remaining assignments(2hrs).");
System.out.println("Practiced some samples on ArrayList(2hrs).\n");
System.out.println("Goals:\n"+"My goal is to study more about collections.");
System.out.println("Blockers:\n"+"No blockers");


s.close();


}
 
		 


}
