package com.bcj.corejava.oops.classes.medium.lab7;

/**
 * @author Bootcamp User 005
 * this class is an traveller entity which stores the details of  the traveller
 * and intializes all the values by using getters and setters 
 *
 */
public class Traveller {
	private int travellerId;
	private int baggageAmount;
	private int expiryYear;
	private boolean nocStatus;
	public int getTravellerId() {
		return travellerId;
	}
	public void setTravellerId(int travellerId) {
		this.travellerId = travellerId;
	}
	public int getBaggageAmount() {
		return baggageAmount;
	}
	public void setBaggageAmount(int baggageAmount) {
		this.baggageAmount = baggageAmount;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	public boolean isNocStatus() {
		return nocStatus;
	}
	public void setNocStatus(boolean nocStatus) {
		this.nocStatus = nocStatus;
	}
	

}
