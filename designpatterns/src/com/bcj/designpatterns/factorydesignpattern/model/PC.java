package com.bcj.designpatterns.factorydesignpattern.model;

public class PC extends Computer {

<<<<<<< HEAD
//this is a change

=======
>>>>>>> 96b5c57366ad685b6446a1c0f5a3f59608861971
	private String ram;
	private String hdd;
	private String cpu;
	
	public PC(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

}