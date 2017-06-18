package com.bcj.psbbussinessparks.modal;

/**
 * @author Bootcamp User 005 this is an entity class used to load the the
 *         payment details given the user by using getters and setters
 */
public class Payment {
	private String nameOnCard;
	private String cardNumber;
	private String cvv;
	private String amount;

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
