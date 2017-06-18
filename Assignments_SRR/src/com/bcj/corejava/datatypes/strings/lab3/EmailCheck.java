package com.bcj.corejava.datatypes.strings.lab3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Bootcamp User 005
 * this class is used to validate the email id by using regular expressions 
 *
 */
public class EmailCheck {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter email id ");
		String email = s.nextLine();
		s.close();
		if (email.length() > 3 && email.length() < 20) {
		} else
			System.out.println("invalid length of email");
		String[] emailParts = email.split("@");
		int count = 0, counter = 0;
		
		//checks the email if it contains more than 2 "." 
		Pattern p = Pattern.compile("\\.");
		Matcher m = p.matcher(emailParts[1]);
		while (m.find()) {
			count++; // System.out.println(m.start());
		}
		// checks the email if it contains alphanumeric characters including special character "_"
		Pattern p1 = Pattern.compile("[^a-zA-Z0-9_]");
		Matcher m1 = p1.matcher(emailParts[0]);
		while (m1.find()) {
			counter++;
		}
		if (count > 2)
			System.out.println("Invalid Position of Special Characters ");
		else if (counter >= 1)
			System.out.println("Invalid Combination for username");
		
		//checks the first letter of email is UpperCase
		else if (Character.isUpperCase(emailParts[0].charAt(0)) != true)
			System.out.println("Invalid Case of First Letter ");
		else
			System.out.println("Email Id is VALID!");
	}
}
