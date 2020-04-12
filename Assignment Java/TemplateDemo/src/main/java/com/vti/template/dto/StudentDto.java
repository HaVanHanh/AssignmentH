package com.vti.template.dto;

import com.vti.template.entity.Student;

/**
 * This class is student dto.
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: Dec 7, 2019
 */
public class StudentDto {

	private Integer id;
	private String name;
	private Integer age;
	private boolean gender;
	private String password;

	/**
	 * Constructor for class StudentForm.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 7, 2019
	 * 
	 */
	public StudentDto(Student student) {
		this.id = student.getRN();
		this.name = student.getName();
		this.age = student.getAge();
		if (student.getGender() == 1) {
			this.gender = true;
		} else {
			this.gender = false;
		}
		this.password = student.getPassword();
	}

	/**
	 * Constructor for class StudentDto for getting entity from repository
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 7, 2019
	 * @param id
	 * @param name
	 * @param age
	 * @param gender
	 */
	public StudentDto(Integer id, String name, Integer age, boolean gender, String password) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.password = password;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the gender
	 */
	public boolean isGender() {
		return gender;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String result = "";
		if (id != null) {
			result += "ID: " + id + " ";
		}

		if (name != null && !name.trim().isEmpty()) {
			result += "Name: " + name + " ";
		}

		if (age != null) {
			result += "Age: " + age + " ";
		}

		result += "Gender: " + gender;

		return result;
	}

}
