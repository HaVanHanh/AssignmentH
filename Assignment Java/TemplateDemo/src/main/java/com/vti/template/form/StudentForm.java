package com.vti.template.form;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.vti.template.entity.Student;

/**
 * This class is student Form.
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: Dec 7, 2019
 */
public class StudentForm {

	@NotNull(message = "Name canot be null")
	private Integer id;
	
	@NotNull(message = "Name canot be null")
	private String name;
	
	@NotNull(message = "Name canot be null")
	private Integer age;
	
	@AssertTrue
	private boolean gender;
	
	@NotNull(message = "Name canot be null")
	@NotEmpty(message = "Name canot be empty")
	@Size(min = 5, max =150 , message= "password must be between 6 and 150 character ")
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
	public StudentForm(Student student) {
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

	public StudentForm() {
		super();
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
	public StudentForm(Integer id, String name, Integer age, boolean gender, String password) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.password = password;
	}
	
	
	/**
	 * Constructor for class StudentForm for creating.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 15, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 15, 2020
	 * @param name
	 * @param age
	 * @param gender
	 * @param password
	 */
	public StudentForm(String name, Integer age, boolean gender, String password) {
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

	/**
	 * This method convert form to entity in order to create.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 13, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 13, 2019
	 * @return entity
	 */
	public Student toEntityCreate() {
		int gender;
		if (this.gender) {
			gender = 1;
		} else {
			gender = 0;
		}
		return new Student()
				.setName(name)
				.setAge(age)
				.setGender(gender)
				.setPassword(password);
	}

	/**
	 * This method convert form to entity in order to update.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 13, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 13, 2019
	 * @return entity
	 */
	public Student toEntityUpdate() {
		int gender;
		if (this.gender) {
			gender = 1;
		} else {
			gender = 0;
		}
		return new Student()
				.setRN(id)
				.setName(name)
				.setAge(age)
				.setGender(gender)
				.setPassword(password);
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
