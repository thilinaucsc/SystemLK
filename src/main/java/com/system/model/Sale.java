package com.system.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SALE")
public class Sale {

	// member variables
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	
	@Column(name= "	PRICE")
	private String price;
	
	@Column(name= "DISCOUNT")
	private String discount;
	
	@Column(name= "TOTAL_PRICE")
	private String totalPrice;
	
	@Column(name= "CUSTOMER_ID")
	private int customerId;

	// default constructor
	public Sale() {
		super();
	}
	
	// 5-arg parameterized-constructor
	public Sale(int id, String price, String discount, String totalPrice, int customerId){
		super();
		this.id  = id;
		this.price = price;
		this.discount = discount;
		this.totalPrice = totalPrice;
		this.customerId = customerId;
	}

	// getters & setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the discount
	 */
	public String getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	/**
	 * @return the totalPrice
	 */
	public String getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	

}
