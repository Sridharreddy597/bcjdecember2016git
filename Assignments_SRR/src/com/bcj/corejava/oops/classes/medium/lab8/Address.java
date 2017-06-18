package com.bcj.corejava.oops.classes.medium.lab8;

/**
 * @author Bootcamp User 005
 *this class is an entity class of adrdess which stores the addressby using setters 
 *and gives acess to other class by using getters
 */
public class Address {
	private String addressLine;
	private String city;
	private String zip;
	private String state;
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
