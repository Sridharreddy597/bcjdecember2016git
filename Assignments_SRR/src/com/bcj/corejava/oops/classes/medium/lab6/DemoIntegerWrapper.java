package com.bcj.corejava.oops.classes.medium.lab6;

/**
 * @author Bootcamp User 005
 *this class is used to call the methods present in IntegerWrapper class
 */
public class DemoIntegerWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerWrapper iw1=new IntegerWrapper(10);
		IntegerWrapper iw2=new IntegerWrapper(20);
		
		System.out.println("-------------values before swapping --------");
		System.out.println("value of a of object iw1 : "+iw1.getA());
		System.out.println("value of a of object iw2 : "+iw2.getA());
		
		System.out.println();
		IntegerWrapper.swap(iw1, iw2);
		
		System.out.println("-------------values after swapping --------");
		System.out.println("value of a of object iw1  : "+iw1.getA());
		System.out.println("value of a of object iw2  : "+iw2.getA());

		


	}

}
