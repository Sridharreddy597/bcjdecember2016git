package com.bcj.hibernate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity 
public class Vechicle {

	@Id  @GeneratedValue
	private int vechicleId;
	private String vehicleName;
	
	
	public int getVechicleId() {
		return vechicleId;
	}
	public void setVechicleId(int vechicleId) {
		this.vechicleId = vechicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	
}
