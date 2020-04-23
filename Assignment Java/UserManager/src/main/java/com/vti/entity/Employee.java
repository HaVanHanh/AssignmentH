//
package com.vti.entity;

/**
 * This class is employee entity .
 * 
 * @Description: .
 * @author: HVHanh
 * @create_date: Apr 12, 2020
 * @version: 1.0
 * @modifer: HVHanh
 * @modifer_date: Apr 12, 2020
 */
public class Employee {

	private String email;

	private String firstName;
	private String lastName;
	private String phone;
	private String projectName;
	private String ProSkill;
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
	public Employee setEmail(String email) {
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
	public Employee setFirstName(String firstName) {
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
	public Employee setLastName(String lastName) {
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
	public Employee setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the projectName to set
	 */
	public Employee setProjectName(String projectName) {
		this.projectName = projectName;
		return this;
	}

	/**
	 * @return the proSkill
	 */
	public String getProSkill() {
		return ProSkill;
	}

	/**
	 * @param proSkill the proSkill to set
	 */
	public Employee setProSkill(String proSkill) {
		ProSkill = proSkill;
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
	public Employee setPassword(String password) {
		this.password = password;
		return this;
	}

}
