package com.bcj.ead;

public class EadDao {

	public void displayEADDetails(ApplicantInfo obj) {
		System.out.println();
		System.out.println();
		System.out.println("your EAD details are :\n\n");

		System.out.println("fullName       :   " + obj.getFullName());
		System.out.println("dateOfBirth    :   " + obj.getDateOfBirth());
		System.out.println("gender         :   " + obj.getGender());
		System.out.println("nationality    :   " + obj.getNationality());
		System.out.println("eadUscisNo     :   " + obj.getEadUscisNo());
		System.out.println(" startDate     :   " + obj.getStartDate());
		System.out.println("expirationDate :   " + obj.getExpirationDate());

	}

}
