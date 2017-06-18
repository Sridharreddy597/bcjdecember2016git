package com.bcj.corejava.flowcontrol.lab9;

import java.util.Scanner;

/**
 * @author Bootcamp User 005
 * the purpose of this class is to give the information that the given sides of triangle
 * forms a right angled triangle or not
 */
public class RightAngledTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		/*takes the input from the user 
		  through the scanner statements */
		
		System.out.println("enter the AB side of triangle ");
				int a=s.nextInt();
				System.out.println("enter the BC side of triangle ");
				int b=s.nextInt();
				System.out.println("enter the AC side of triangle ");
				int c=s.nextInt();
				s.close();
				// checks the condition through pythagoras theorem
				if((a*a)==(b*b)+(c*c))
					System.out.println("given sides form rightangled triangle");
				else if((b*b)==(a*a)+(c*c))
					System.out.println("given sides form rightangled triangle");
				if((c*c)==(b*b)+(a*a))
					System.out.println("given sides form rightangled triangle");
				
				else 
					System.out.println("given sides does not form right angled triangle");



	}

}
