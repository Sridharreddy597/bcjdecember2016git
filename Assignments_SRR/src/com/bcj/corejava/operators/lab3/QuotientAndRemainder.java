/**
 * 
 */
package com.bcj.corejava.operators.lab3;

import java.util.Scanner;

/**
 * @author Bootcamp User 005
 *
 */
public class QuotientAndRemainder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s=new Scanner(System.in);
System.out.println("enter any two integers");
int num1=s.nextInt();
int num2=s.nextInt();
s.close();
int result=num1/num2;
int remainder=num1%num2;
System.out.println("The result and remainder of two integers are "+result+"\tand\t"+remainder+"\trespectively");

	}

}
