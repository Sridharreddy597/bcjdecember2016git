package com.bcj.praticeproblems;

import java.util.Scanner;

public class Palindrome {

	
	public static void main(String[] args) {
			
		 Scanner sc=new Scanner(System.in);	      
	        StringBuffer sb = new StringBuffer(sc.next().trim().toLowerCase());
	        if((sb.reverse().toString()).equalsIgnoreCase(sb.toString())){
	            System.out.println("Yes");
	        }
	      
	}
}
