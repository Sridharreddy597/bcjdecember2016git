package com.bcj.restexample.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;






@Entity
@XmlRootElement(name = "customer")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Document
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 837;
	
	
	@GeneratedValue
	@Id
	private int _id;
	private String firstName;
	private String lastName;



	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Customer [_id=" + _id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}
