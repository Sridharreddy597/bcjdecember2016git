package com.bcj.corejava.oops.classes.medium.lab7;

/**
 * @author Bootcamp User 005
 * this class takes the details of the traveller and 
 * decides  to allow or recheck the traveller 
 *
 */
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traveller tvlr=new Traveller();
		tvlr.setTravellerId(1001);
		tvlr.setBaggageAmount(35);
		tvlr.setExpiryYear(2019);
		tvlr.setNocStatus(true);
		Checks chk =new Checks();
		if(chk.checkBaggage(tvlr) &&chk.checkImmigration(tvlr) && chk.checkSecurity(tvlr))
		System.out.println("Allow Traveller to fly");
		
		else System.out.println(" Detain Traveller for Re-Checking");;
		

	}

}
