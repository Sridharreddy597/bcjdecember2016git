package com.bcj.creditcard;

public class Applicant {
private String firstName;
private  String lastName;
private  String  dateOfBirth;
private  String ssn;
private String email;
private String mobile;
private String  employmentStatus;
private  double  grossIncome;
private double monthlyRentPayment;
private double totalAssets;
private double creditlimit;
private boolean creditCardStatus;
public boolean isCreditCardStatus() {
	return creditCardStatus;
}

public void setCreditCardStatus(boolean creditCardStatus) {
	this.creditCardStatus = creditCardStatus;
}
public double getMonthlyRentPayment() {
	return monthlyRentPayment;
}
public void setMonthlyRentPayment(double monthlyRentPayment) {
	this.monthlyRentPayment = monthlyRentPayment;
}
public double getCreditlimit() {
	return creditlimit;
}
public void setCreditlimit(double creditlimit) {
	this.creditlimit = creditlimit;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getSsn() {
	return ssn;
}
public void setSsn(String ssn) {
	this.ssn = ssn;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getEmploymentStatus() {
	return employmentStatus;
}
public void setEmploymentStatus(String employmentStatus) {
	this.employmentStatus = employmentStatus;
}
public double getGrossIncome() {
	return grossIncome;
}
public void setGrossIncome(double grossIncome2) {
	this.grossIncome = grossIncome2;
}

public double getTotalAssets() {
	return totalAssets;
}
public void setTotalAssets(double totalAssets) {
	this.totalAssets = totalAssets;
}




}
