package com.bcj.corejava.datatypes.strings.lab2;

import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the birth date in the format of MM/DD/YYYY ");
	
		String birthdate=s.nextLine();
s.close();
		String[] bDate=birthdate.split("/");
		for (String s1 : bDate) {
            System.out.println(s1);
        }
	}

}
