/**
 * 
 */
package com.vti.testingsystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class is .
 * 
 * @Description: .
 * @author: Hanh Ha
 * @create_date: Feb 5, 2020
 * @version: 1.0
 * @modifer: Hanh Ha
 * @modifer_date: Feb 5, 2020
 */

@Entity
@Table(name = "Testing_Category", catalog = "TestingSystem")
public class TestingCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private short id;

	@Column(name = "name", length = 50, nullable = false, unique = true, insertable = true, updatable = true)
	private String name;

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * Constructor for class TestingCategory.
	 * 
	 * @Description: .
	 * @author: Hanh Ha
	 * @create_date: Feb 5, 2020
	 * @version: 1.0
	 * @modifer: Hanh Ha
	 * @modifer_date: Feb 5, 2020
	 * @param id
	 * @param name
	 */
	public TestingCategory(short id, String name) {

		this.id = id;
		this.name = name;
	}

	/**
	 * 
	 * Constructor for class TestingCategory.
	 * 
	 * @Description: .
	 * @author: Hanh Ha
	 * @create_date: Feb 5, 2020
	 * @version: 1.0
	 * @modifer: Hanh Ha
	 * @modifer_date: Feb 5, 2020
	 */
	public TestingCategory() {
		super();
	}

}
