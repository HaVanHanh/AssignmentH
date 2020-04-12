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
@Table(name = "Level_Question", catalog = "TestingSystem")
public class LevelQuestion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private short id;

	@Column(name = "level", length = 20, nullable = false, unique = false, insertable = true, updatable = true)
	private String level;

	public short getId() {
		return id;
	}

	public LevelQuestion setId(short id) {
		this.id = id;
		return this;
	}

	public String getLevel() {
		return level;
	}

	public LevelQuestion setLevel(String level) {
		this.level = level;
		return this;
	}

	/**
	 * 
	 * Constructor for class LevelQuestion.
	 * 
	 * @Description: .
	 * @author: Hanh Ha
	 * @create_date: Feb 5, 2020
	 * @version: 1.0
	 * @modifer: Hanh Ha
	 * @modifer_date: Feb 5, 2020
	 * @param id
	 * @param level
	 */
	public LevelQuestion(short id, String level) {

		this.id = id;
		this.level = level;
	}

	/**
	 * Constructor for class LevelQuestion.
	 * 
	 * @Description: .
	 * @author: Hanh Ha
	 * @create_date: Feb 5, 2020
	 * @version: 1.0
	 * @modifer: Hanh Ha
	 * @modifer_date: Feb 5, 2020
	 */

	public LevelQuestion() {

	}

}
