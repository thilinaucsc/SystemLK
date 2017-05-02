package com.system.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ITEM")
public class Item {
	
	// member variables
	@Id
	@GeneratedValue
	@Column(name= "ID")
	private int id;
	
	@Column(name= "NAME")
	private String name;
	
	@Column(name= "PRICE")
	private String price;
	
	@Column(name= "DISCOUNT")
	private String discount;
	
	@Column(name= "GOOD")
	private int good;
	
	@Column(name= "SERVICE")
	private int service;
	
	@Column(name= "COMPANY_ID")
	private int companyId;
	
	// default constructor
	public Item(){
		super();
	}
	
	// 7-arg parameterized-constructor
	public Item(int id, String name, String price, String discount, int good, int service, int companyId){
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.good = good;
		this.service = service;
		this.companyId = companyId;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public int getGood() {
		return good;
	}

	public void setGood(int good) {
		this.good = good;
	}

	public int getService() {
		return service;
	}

	public void setService(int service) {
		this.service = service;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
}
