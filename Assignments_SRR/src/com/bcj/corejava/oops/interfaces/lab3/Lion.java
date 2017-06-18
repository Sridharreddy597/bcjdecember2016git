package com.bcj.corejava.oops.interfaces.lab3;

public class Lion implements LandMammal {

	/* (non-Javadoc)
	 * @see com.bcj.corejava.oops.interfaces.lab3.Mammal#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" I am lion ");
		
	}

	/* (non-Javadoc)
	 * @see com.bcj.corejava.oops.interfaces.lab3.LandMammal#walk()
	 */
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("I can walk ");
	}

	/* (non-Javadoc)
	 * @see com.bcj.corejava.oops.interfaces.lab3.LandMammal#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I can run");
	}

	@Override
	public void crawl() {
		// TODO Auto-generated method stub
		System.out.println("I can crawl");
		
	}
	

}
