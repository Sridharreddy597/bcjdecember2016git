package com.bcj.psbbussinessparks.modal;

/**
 * @author Bootcamp User 005 this is an entity class used to load the the
 *         address details given the user by using getters and setters
 *
 */
public class Tenant {

	private String firstName;
	private String lastName;
	private String tPhone;
	private String tEmail;
	private String tUserId;
	private String tPassword;

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

	public String gettPhone() {
		return tPhone;
	}

	public void settPhone(String tPhone) {
		this.tPhone = tPhone;
	}

	public String gettEmail() {
		return tEmail;
	}

	public void settEmail(String tEmail) {
		this.tEmail = tEmail;
	}

	public String gettUserId() {
		return tUserId;
	}

	public void settUserId(String tUserId) {
		this.tUserId = tUserId;
	}

	public String gettPassword() {
		return tPassword;
	}

	public void settPassword(String tPassword) {
		this.tPassword = tPassword;
	}

}
