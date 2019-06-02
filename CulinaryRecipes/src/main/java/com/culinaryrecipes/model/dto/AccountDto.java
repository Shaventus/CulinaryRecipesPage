package com.culinaryrecipes.model.dto;

import java.util.Date;

import com.culinaryrecipes.model.Account;

public class AccountDto {
	
	private int idAccount;

	private String email;


	private byte enabled;


	private String password;


	private String username;
	
	public AccountDto() {
		
	}
	
	public AccountDto(Account account) {
		this.username = account.getUsername();
		this.password = account.getPassword();
		this.email = account.getEmail();
		this.enabled = account.getEnabled();
		this.idAccount = account.getIdAccount();
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

	public int getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	
	
}
