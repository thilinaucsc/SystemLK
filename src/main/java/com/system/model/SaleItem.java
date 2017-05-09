/**
 * 
 */
package com.system.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author thilina
 *
 */

@Entity
@Table(name = "SALEITEM")
public class SaleItem {

	// member variables
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	
	@Column(name= "DISCOUNT")
	private String discount;
	
	@Column(name= "TOTAL_PRICE")
	private String totalPrice;
	
	@Column(name= "ITEM_ID")
	private int itemId;
	
	@Column(name= "SALE_ID")
	private int saleId;
	
	// default constructor
	public SaleItem(){
		super();
	}
	
	// 5-arg parameterized-constructor
	public SaleItem(int id, String discount,  String totalPrice, int itemId, int saleId){
		super();
		this.id = id;
		this.discount = discount;
		this.totalPrice = totalPrice;
		this.itemId = itemId;
		this.saleId = saleId;
	}

	// getters & setters
	/**
	 * @return the discount
	 */
	public String getDiscount() {
		return discount;
	}

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
	 * @return the itemId
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return the saleId
	 */
	public int getSaleId() {
		return saleId;
	}

	/**
	 * @param saleId the saleId to set
	 */
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
}
