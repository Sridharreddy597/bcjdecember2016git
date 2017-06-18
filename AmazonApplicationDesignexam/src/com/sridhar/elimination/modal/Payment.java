package com.sridhar.elimination.modal;

public class Payment {
	
	private  String ccNumber1;
	private String Name;
	private int cvv;
	private double amount;
	public String getCcNumber1() {
		return ccNumber1;
	}
	public void setCcNumber1(String string) {
		this.ccNumber1 = string;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
