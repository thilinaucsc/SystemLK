package com.system.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "COMPANY")
public class Company {

	// member variables
	@Id
	@GeneratedValue
	@Column(name= "ID")
	private int id;
	
	@Column(name= "NAME")
	private String name;
	
	@Column(name= "LOCATION")
	private String location;
	
	@Column(name= "USER_ID")
	private int userID;
	
	// default constructor
	public Company(){
		super();
	}
	
	// 4-arg parameterized-constructor
	public Company(int id, String name, String location, int userID){
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.userID = userID;
	}

	// getters & setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}	
}
