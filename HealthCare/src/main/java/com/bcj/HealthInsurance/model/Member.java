package com.bcj.HealthInsurance.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Member {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name="member_id")
	private int member_id;
	private String firstName;
	private String lastName;
	private String middleName;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addressId")
	private Address address;
	private String mobile;
	private String email;
	private String dateOfBirth;
	private String annualIncome;
	private String houseMortage;
	private String ssn;
	
	
	
	@OneToMany(mappedBy="member",cascade=CascadeType.ALL)
	private List<Dependent> dependents;
	
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getHouseMortage() {
		return houseMortage;
	}
	public void setHouseMortage(String houseMortage) {
		this.houseMortage = houseMortage;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Member [id=" + member_id + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", address=" + address + ", mobile=" + mobile + ", email=" + email + ", dateOfBirth=" + dateOfBirth
				+ ", annualIncome=" + annualIncome + ", houseMortage=" + houseMortage + ", ssn=" + ssn + "]";
	}
	
	
	
	public List<Dependent> getDependents() {
		return dependents;
	}
	public void setDependents(List<Dependent> dependents) {
		this.dependents = dependents;
	}
	
	
	
	
	
	
	

}
