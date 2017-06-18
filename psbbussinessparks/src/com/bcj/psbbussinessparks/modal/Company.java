package com.bcj.psbbussinessparks.modal;


/**
 * @author Bootcamp User 005
 *this is an entity class used to load the the
 *         company details given the user by using getters and setters
 */
public class Company {
	private String companyName;
	private String phone;
	private String email;
	private Address add;
	private Tenant tnt;
	private int companyId;

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int i) {
		this.companyId = i;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Tenant getTnt() {
		return tnt;
	}

	public void setTnt(Tenant tnt) {
		this.tnt = tnt;
	}

	/*public String toString(){
	return	this.companyName+this.phone+this.email+this.companyId;
	}*/
	}
