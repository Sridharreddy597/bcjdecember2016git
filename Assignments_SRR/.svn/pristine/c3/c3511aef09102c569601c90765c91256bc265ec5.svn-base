package com.bcj.corejava.datatypes.strings.lab5;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Bootcamp User 005
 * this class is defined to check the email id provided by the user using regular expressions 
 *
 */
public class emailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the eamil address");
		Scanner s=new Scanner(System.in);
		String emailId=s.nextLine();
		s.close();
		//checks for the  email id given by the user and  matches with given pattern 
		 if(Pattern.matches("[a-zA-Z]+@+[a-zA-Z]+\\.com", emailId))
		{
			System.out.println("valid  email id ");
		}
		else System.out.println(" invalid email id ");
		

	}

}
