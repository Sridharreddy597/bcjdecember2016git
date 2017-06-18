package com.bcj.corejava.operators.lab5;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter an integer");
		int input =s.nextInt();
		s.close();
		if(input%2==0)
		System.out.println("given number is even");
		else
			System.out.println("given no is odd");

	}

}
