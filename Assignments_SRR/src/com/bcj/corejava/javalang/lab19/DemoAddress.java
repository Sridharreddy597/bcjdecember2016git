package com.bcj.corejava.javalang.lab19;

public class DemoAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Address ad =new Address();
		ad.setAddressLine("8231 RanchView Dr");
		ad.setCity("Irving");
		ad.setZip("75063");
		ad.setState("Texas");
		System.out.println("AddressLine : "+ad.getAddressLine()+"\n"+"city        : "+ad.getCity()+"\n zip        : "+ad.getZip()+"\n state      : "+ad.getState());
	}

}
