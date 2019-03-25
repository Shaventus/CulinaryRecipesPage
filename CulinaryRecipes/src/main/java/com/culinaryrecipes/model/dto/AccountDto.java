package com.culinaryrecipes.model.dto;

import java.util.Date;

public class AccountDto {

	private Date creationAccountDate;

	private String email;


	private byte enabled;


	private String password;


	private String username;


	/**
	 * @return the creationAccountDate
	 */
	public Date getCreationAccountDate() {
		return creationAccountDate;
	}


	/**
	 * @param creationAccountDate the creationAccountDate to set
	 */
	public void setCreationAccountDate(Date creationAccountDate) {
		this.creationAccountDate = creationAccountDate;
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
	 * @return the enabled
	 */
	public byte getEnabled() {
		return enabled;
	}


	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(byte enabled) {
		this.enabled = enabled;
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


	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}


	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
