package com.bcj.corejava.oops.interfaces.lab3;

/**
 * @author Bootcamp User 005
 *this class is used to implements al the methods from landmammal
 */
public class Human implements LandMammal {


	/* (non-Javadoc)
	 * @see com.bcj.corejava.oops.interfaces.lab3.Mammal#display()
	 * diplays the content
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am Human ");
		
	}

	/* (non-Javadoc)
	 * @see com.bcj.corejava.oops.interfaces.lab3.LandMammal#walk()
	 * this method says that human can walk 
	 */
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("I can walk ");
	}

	/* (non-Javadoc)
	 * @see com.bcj.corejava.oops.interfaces.lab3.LandMammal#run()
	 *  this method says that human can walk 
	 */
	/* (non-Javadoc)
	 * @see com.bcj.corejava.oops.interfaces.lab3.LandMammal#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I can run");
	}

	/* (non-Javadoc)
	 * @see com.bcj.corejava.oops.interfaces.lab3.LandMammal#crawl()
	 */
	@Override
	public void crawl() {
		// TODO Auto-generated method stub
		System.out.println("I can crawl");
		
	}
	

}
