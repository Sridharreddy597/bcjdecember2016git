package com.bcj.praticeproblems;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		if(s.isEmpty() && s!=null){
			System.out.print(s.length());
		}else{
			
		if (s.length() >= 1 && s.length() < 4 * Math.pow(10, 5)) {
			String str[] = s.trim().split("[ .,?!'@_]+");
			System.out.println(str.length);
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
		}
		}
		scan.close();
	}
}