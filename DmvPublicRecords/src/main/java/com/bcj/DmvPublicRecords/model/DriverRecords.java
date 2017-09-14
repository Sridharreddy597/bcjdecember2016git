package com.bcj.DmvPublicRecords.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
 
@Entity
public class DriverRecords implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5793408374101028024L;

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id ;
	private String  drivingStatus;
	private String drivingOffenses;
	private String accidentInfo;
	private  String vin;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="vechicleId")
	private Vehicle vechicle;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDrivingStatus() {
		return drivingStatus;
	}
	public void setDrivingStatus(String drivingStatus) {
		this.drivingStatus = drivingStatus;
	}
	public String getDrivingOffenses() {
		return drivingOffenses;
	}
	public void setDrivingOffenses(String drivingOffenses) {
		this.drivingOffenses = drivingOffenses;
	}
	public String getAccidentInfo() {
		return accidentInfo;
	}
	public void setAccidentInfo(String accidentInfo) {
		this.accidentInfo = accidentInfo;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", drivingStatus=" + drivingStatus + ", drivingOffenses=" + drivingOffenses
				+ ", accidentInfo=" + accidentInfo + ", vin=" + vin + "]";
	}
	public Vehicle getVechicle() {
		return vechicle;
	}
	public void setVechicle(Vehicle vechicle) {
		this.vechicle = vechicle;
	}
	
		
	
}
