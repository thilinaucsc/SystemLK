package com.system.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

	// member variables
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int customerId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "AGE")
	private int age;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "DISCOUNT")
	private String discount;

	@Column(name = "REGISTOR")
	private int registor;

	// default constructor
	public Customer() {
		super();
	}

	// 8-arg parameterized-constructor
	public Customer(int customerId, String name, int age, String address, String discount, int registor, String password, String email) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.age = age;
		this.address = address;
		this.discount = discount;
		this.registor = registor;
		this.password = password;
		this.email = email;
	}

	// getters & setters
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public int getRegistor() {
		return registor;
	}

	public void setRegistor(int registor) {
		this.registor = registor;
	}
}