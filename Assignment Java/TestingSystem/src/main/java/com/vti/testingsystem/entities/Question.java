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
@Table(name = "Question", catalog = "TestingSystem")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private short id;

	@Column(name = "level", nullable = false, unique = false, insertable = true, updatable = true)
	private String level;

	@Column(name = "status", nullable = false, unique = false, insertable = true, updatable = true)
	private Status status;

	/**
	 * @return the id
	 */
	public short getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public Question setId(short id) {
		this.id = id;
		return this;
	}

	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public Question setLevel(String level) {
		this.level = level;
		return this;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public Question setStatus(Status status) {
		this.status = status;
		return this;
	}

	/**
	 * Constructor for class Question.
	 * 
	 * @Description: .
	 * @author: Hanh Ha
	 * @create_date: Feb 5, 2020
	 * @version: 1.0
	 * @modifer: Hanh Ha
	 * @modifer_date: Feb 5, 2020
	 * @param id
	 * @param level
	 * @param status
	 */

	public Question(short id, String level, Status status) {

		this.id = id;
		this.level = level;
		this.status = status;
	}

	public enum Status {
		PUBLISHED("1"), DRAFT("0");

		private String code;

		private Status(String code) {
			this.code = code;
		}

		public String getCode() {
			return code;
		}
	}

}
