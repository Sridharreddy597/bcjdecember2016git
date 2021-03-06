package com.bcj.atenainsurance.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity 
public class Member implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	private String firstName;
	private String LastName;
	private String ssn;
	private String plan;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addressId")
	private Address address;

	public String getSsn() {
		return ssn;
	}

	public int getId() {
		return id;
	}
<<<<<<< HEAD
	
=======

>>>>>>> 96b5c57366ad685b6446a1c0f5a3f59608861971
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Member [id=" + id + ", firstName=" + firstName + ", LastName=" + LastName + ", ssn=" + ssn + ", plan="
				+ plan + ", address=" + address + "]";
	}
	

}
