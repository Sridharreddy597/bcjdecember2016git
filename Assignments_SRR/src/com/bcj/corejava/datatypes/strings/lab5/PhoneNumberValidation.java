package com.bcj.corejava.datatypes.strings.lab5;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Bootcamp User 005
 * this class is defined to validate the phone number given by user 
 *
 */
public class PhoneNumberValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your mobile number in the format of the following\nxxx-xxx-xxxx\nxxx.xxx.xxxx\nxxx xxx xxxx\n ");
		Scanner s = new Scanner(System.in);
		//takes the input from the user
		String mobileNo = s.nextLine();
		s.close();
		
		//checks for the given pattern 
		if((Pattern.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}", mobileNo))||(Pattern.matches("[0-9]{3} [0-9]{3} [0-9]{4}", mobileNo))||(Pattern.matches("[0-9]{3}\\s[0-9]{3}\\s[0-9]{4}", mobileNo)))
		{
			System.out.println("mobile number is valid ");
		}
		else System.out.println("invalid mobile number ");
	}

}
