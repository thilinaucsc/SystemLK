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
 * @author thili
 *
 */

@Entity
@Table(name = "USER")
public class User {
	
	// member variables
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	
	@Column(name= "NAME")
	private String name;
	
	@Column(name= "	EMAIL")
	private String email;
	
	@Column(name = "PASSWORD")
	private String password;
	
	// default constructor
	public User(){
		super();
	}
	
	// 5-arg parameterized-constructor
	public User(int id, String name, String email, String password){
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
