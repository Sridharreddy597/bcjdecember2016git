package com.bcj.test;

import java.util.Scanner;

public class StringPatternTest {

	static String strng;
	static String str1[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		strng = str.replace(":", "->");
		str1 = strng.split(",");
		for (String i : str1) {

			System.out.println(i);
		}

		System.out.println("enter the string to print its respective Integer");
		String st = sc.next();
		for (String i : str1) {
			String stg[] = i.split("->");
			if ((st).equals(stg[0]))
				System.out.println(stg[1]);
		}
sc.close();
	}
}
