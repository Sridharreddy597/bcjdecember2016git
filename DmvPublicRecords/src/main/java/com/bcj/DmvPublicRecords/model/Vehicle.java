package com.bcj.DmvPublicRecords.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String vin;
	private String vechicleType;
	private String vechicleModel;
	private String manufacturer;
	private String price;
	private String insuranceCompany;
	private String insurancePolicyNumber; 
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getVechicleType() {
		return vechicleType;
	}
	public void setVechicleType(String vechicleType) {
		this.vechicleType = vechicleType;
	}
	public String getVechicleModel() {
		return vechicleModel;
	}
	public void setVechicleModel(String vechicleModel) {
		this.vechicleModel = vechicleModel;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getInsurancePolicyNumber() {
		return insurancePolicyNumber;
	}
	public void setInsurancePolicyNumber(String insurancePolicyNumber) {
		this.insurancePolicyNumber = insurancePolicyNumber;
	}
	public String getInsuranceCompany() {
		return insuranceCompany;
	}
	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vin=" + vin + ", vechicleType=" + vechicleType + ", vechicleModel="
				+ vechicleModel + ", manufacturer=" + manufacturer + ", price=" + price + ", insuranceCompany="
				+ insuranceCompany + ", insurancePolicyNumber=" + insurancePolicyNumber + "]";
	}
	
	
	
	

}
