package com.bcj.corejava.datatypes.strings.lab5;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Bootcamp User 005
 * this class is defined to validate the ip address given by the user 
 *
 */
public class IPAddressValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the ip address in the format of following \n x.x.x.x");
		Scanner s= new Scanner(System.in);
		//takes the input from the user
		String ipaddress=s.nextLine();
		s.close();
		
		//checks for the given pattern 
		if(Pattern.matches("[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}", ipaddress))
		{
			System.out.println("your ip address is valid ");
		}
		else System.out.println("in valid ip address");
		

	}

}
