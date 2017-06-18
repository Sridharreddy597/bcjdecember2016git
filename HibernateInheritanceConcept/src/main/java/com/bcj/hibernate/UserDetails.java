package com.bcj.hibernate;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity @Table(name="user_details")
public class UserDetails {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private int userId;
	private String  userName;
	
	@OneToMany @JoinTable(name="user-vechicle",joinColumns=@JoinColumn(name="user-id"),inverseJoinColumns=@JoinColumn(name="vechicle-id") )
	private Collection<Vechicle>  vechicle= new ArrayList<Vechicle>();
	
	
	public Collection<Vechicle> getVechicle() {
		return vechicle;
	}
	public void setVechicle(Collection<Vechicle> vechicle) {
		this.vechicle = vechicle;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
