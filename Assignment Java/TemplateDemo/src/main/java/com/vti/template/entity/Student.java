package com.vti.template.entity;

/**
 * This class is entity of Student.
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: Dec 7, 2019
 */

public class Student {

	private int RN;
	private String name;
	private int age;
	private String password;
	private int gender;

	/**
	 * @return the rN
	 */
	public int getRN() {
		return RN;
	}

	/**
	 * @param rN
	 *            the rN to set
	 * @return
	 */
	public Student setRN(int rN) {
		RN = rN;
		return this;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 * @return
	 */
	public Student setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 * @return
	 */
	public Student setAge(int age) {
		this.age = age;
		return this;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 * @return
	 */
	public Student setPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * @return the gender
	 */
	public int getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 * @return
	 */
	public Student setGender(int gender) {
		this.gender = gender;
		return this;
	}

}
