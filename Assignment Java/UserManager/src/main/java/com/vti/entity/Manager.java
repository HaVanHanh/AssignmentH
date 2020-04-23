//
package com.vti.entity;

/**
 * This class is manager entity .
 * 
 * @Description: .
 * @author: HVHanh
 * @create_date: Apr 12, 2020
 * @version: 1.0
 * @modifer: HVHanh
 * @modifer_date: Apr 12, 2020
 */
public class Manager {

	private String email;
	private String firstName;
	private String lastName;
	private String phone;
	private int ExpInYear;
	private String password;

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public Manager setEmail(String email) {
		this.email = email;
		return this;
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
	public Manager setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public Manager setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public Manager setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * @return the expInYear
	 */
	public int getExpInYear() {
		return ExpInYear;
	}

	/**
	 * @param expInYear the expInYear to set
	 */
	public Manager setExpInYear(int expInYear) {
		ExpInYear = expInYear;
		return this;
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
	public Manager setPassword(String password) {
		this.password = password;
		return this;
	}

}
