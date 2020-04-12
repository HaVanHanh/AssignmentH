package com.vti.testingsystem.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



/**
 * 
 * This class is User entity class.
 * 
 * @Description: .
 * @author: Hanh Ha
 * @create_date: Feb 5, 2020
 * @version: 1.0
 * @modifer: Hanh Ha
 * @modifer_date: Feb 5, 2020
 */
@Entity
@Table(name = "User", catalog = "TestingSystem", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "account", "email" }) })
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private short id;

	@Column(name = "account", length = 50, nullable = false, insertable = true)
	private String account;

	@Column(name = "password", length = 50, nullable = false, insertable = true, updatable = true)
	private String password;

	@Column(name = "firstName", length = 50, nullable = false, insertable = true, updatable = true)
	private String firstName;

	@Column(name = "lastName", length = 50, nullable = false, insertable = true, updatable = true)
	private String lastName;

	@Column(name = "email", length = 50, nullable = false, insertable = true, updatable = true)
	private String email;

	@Column(name = "date_Of_Birth", length = 50, nullable = false, insertable = true, updatable = true)
	private Date dateOfBirth;

	@Column(name = "address", length = 100, nullable = false, insertable = true, updatable = true)
	private String address;

	@Column(name = "phone", length = 15, nullable = false, insertable = true, updatable = true)
	private String phone;

	@Column(name = "gender", length = 50, nullable = false, insertable = true, updatable = true)
	private Gender gender;

	@Column(name = "role", length = 50, nullable = false, insertable = true, updatable = true)
	private Role role;

	@Column(name = "status", nullable = false, insertable = true, updatable = true)
	private boolean status;

	@ManyToOne
	@JoinColumn(name = "id", nullable = false)
	private Department department;

	
	@Override
	public String toString() {
		return "User [id= " + id + ", name= " + firstName + " " + lastName + ", department =" + department + "]";
	}

	/**
	 * @return the id
	 */
	public short getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public User setId(short id) {
		this.id = id;
		return this;
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
	public User setAccount(String account) {
		this.account = account;
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
	public User setPassword(String password) {
		this.password = password;
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
	public User setFirstName(String firstName) {
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
	public User setLastName(String lastName) {
		this.lastName = lastName;
		return this;
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
	public User setEmail(String email) {
		this.email = email;
		return this;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public User setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public User setAddress(String address) {
		this.address = address;
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
	public User setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public User setGender(Gender gender) {
		this.gender = gender;
		return this;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public User setRole(Role role) {
		this.role = role;
		return this;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public User setStatus(boolean status) {
		this.status = status;
		return this;
	}

	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	public User(short id, String account, String password, String firstName, String lastName, String email,
			Date dateOfBirth, String address, String phone, Gender gender, Role role, boolean status) {

		this.id = id;
		this.account = account;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
		this.role = role;
		this.status = status;
	}

	public enum Gender {
		MALE("M"), FEMALE("F"), UNKNOWN("U");

		private String code;

		private Gender(String code) {
			this.code = code;
		}

		public String getCode() {
			return code;
		}
	}
	
	public enum Role {
		ADMIN("Admin"), MANAGER("Manager"), UNREGISTER("UnRegister");
		private String code;

		private Role(String code) {
			this.code = code;
		}

		public String getCode() {
			return code;
		}
	}

}
