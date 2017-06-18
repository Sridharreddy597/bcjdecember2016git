package com.bcj.corejava.oops.interfaces.lab3;

/**
 * @author Bootcamp User 005
 *this class defines the methods present in whale and its features 
 */
public class Whale implements WaterMammal {

	/* (non-Javadoc)
	 * @see com.bcj.corejava.oops.interfaces.lab3.Mammal#display()
	 */
	/* (non-Javadoc)
	 * @see com.bcj.corejava.oops.interfaces.lab3.Mammal#display()
	 * displays the message 
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am whale ");
	}

	/* (non-Javadoc)
	 * @see com.bcj.corejava.oops.interfaces.lab3.WaterMammal#swim()
	 * this methods says that whale can swim 
	 */
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("I can swim");
	}
	

}
