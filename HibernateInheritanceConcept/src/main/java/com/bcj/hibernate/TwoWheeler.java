package com.bcj.hibernate;

import javax.persistence.Entity;


public class TwoWheeler extends  Vechicle {
	
	private String steeringHandle;

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}
	

}
