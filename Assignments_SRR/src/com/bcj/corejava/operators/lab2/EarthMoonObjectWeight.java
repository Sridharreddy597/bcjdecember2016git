/**
 * 
 */
package com.bcj.corejava.operators.lab2;

import java.util.Scanner;

/**
 * @author Bootcamp User 005
 *
 */
public class EarthMoonObjectWeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the weight of object on earth");
		double objweightearth=s.nextDouble();
conversion(objweightearth);
s.close();
	}

	private static void conversion(double weight) {
		// TODO Auto-generated method stub
		double objearthweight=weight;
		double objmoonweight=objearthweight*17/100;
		System.out.println("weight of the object on moon is "+objmoonweight);
		
	}

}
