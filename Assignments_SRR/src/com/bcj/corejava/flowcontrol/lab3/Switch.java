/**
 * 
 */
package com.bcj.corejava.flowcontrol.lab3;

import java.util.Scanner;

/**
 * @author Bootcamp User 005
 *
 */
public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		s.close();
		
		switch(ch){
		
		case 'A': System.out.println("80-100"); break;
		case 'B': System.out.println("73-79"); break;
		case 'C': System.out.println("65-72"); break;
		case 'D': System.out.println("55-64"); break;
		case 'E': System.out.println("<55"); break;
		default : System.out.println("grade does not exist");
		
	}

}
}
