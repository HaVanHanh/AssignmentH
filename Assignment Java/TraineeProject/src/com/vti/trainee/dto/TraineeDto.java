/**
 * 
 */
package com.vti.trainee.dto;

import com.vti.trainee.entites.Trainee;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HanhHa
 * @create_date: Dec 21, 2019
 * @version: 1.0
 * @modifer: HanhHa
 * @modifer_date: Dec 21, 2019
 */
public class TraineeDto {
	private String account;
	private String firstName;
	private String lasName;
	private String email;
	private String password;

	/**
	 * Constructor for class TraineeDto.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 21, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 21, 2019
	 */
	public TraineeDto(Trainee trainee) {
		this.account = trainee.getAccount();
		this.email = trainee.getEmail();
		this.firstName = trainee.getFirstName();
		this.lasName = trainee.getLasName();
		this.password = trainee.getPassword();
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lasName
	 */
	public String getLasName() {
		return lasName;
	}

	/**
	 * @param lasName the lasName to set
	 */
	public void setLasName(String lasName) {
		this.lasName = lasName;
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
