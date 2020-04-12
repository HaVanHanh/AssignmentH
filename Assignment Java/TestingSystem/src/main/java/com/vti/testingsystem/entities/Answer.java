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
@Table(name = "Answer", catalog = "TestingSystem")
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private short id;

	@Column(name = "key", nullable = false, unique = false, insertable = true, updatable = true)
	private String key;

	/**
	 * @return the id
	 */
	public short getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public Answer setId(short id) {
		this.id = id;
		return this;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public Answer setKey(String key) {
		this.key = key;
		return this;
	}

	/**
	 * Constructor for class Answer.
	 * 
	 * @Description: .
	 * @author: Hanh Ha
	 * @create_date: Feb 5, 2020
	 * @version: 1.0
	 * @modifer: Hanh Ha
	 * @modifer_date: Feb 5, 2020
	 * @param id
	 * @param key
	 */

	public Answer(short id, String key) {
		this.id = id;
		this.key = key;
	}

	/**
	 * Constructor for class Answer.
	 * 
	 * @Description: .
	 * @author: Hanh Ha
	 * @create_date: Feb 5, 2020
	 * @version: 1.0
	 * @modifer: Hanh Ha
	 * @modifer_date: Feb 5, 2020
	 */

	public Answer() {

	}

}
