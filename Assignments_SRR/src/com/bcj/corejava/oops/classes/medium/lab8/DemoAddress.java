package com.bcj.corejava.oops.classes.medium.lab8;

/**
 * @author Bootcamp User 005
 *this class is created to set the values to the address class by using setters 
 *and print  all the values of instant varibles of adress class by using getters
 */
public class DemoAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ads= new Address();
		ads.setAddressLine("8231 Ranchview Dr");
		ads.setCity("Irving");
		ads.setZip("75063");
		ads.setState("Texas");

		
		System.out.println(" AddressLine: "+ads.getAddressLine());
		System.out.println(" city : "+ads.getCity());
		System.out.println(" zip : "+ads.getZip());
		System.out.println(" state : "+ads.getState());
	}

}
