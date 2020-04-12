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
@Table(name = "User_Group", catalog = "TestingSystem")
public class UserGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private short id;

	/**
	 * @return the id
	 */
	public short getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public UserGroup setId(short id) {
		this.id = id;
		return this;
	}

	/**
	 * Constructor for class UserGroup.
	 * 
	 * @Description: .
	 * @author: Hanh Ha
	 * @create_date: Feb 5, 2020
	 * @version: 1.0
	 * @modifer: Hanh Ha
	 * @modifer_date: Feb 5, 2020
	 * @param id
	 */

	public UserGroup(short id) {
		this.id = id;
	}

	/**
	 * Constructor for class UserGroup.
	 * 
	 * @Description: .
	 * @author: Hanh Ha
	 * @create_date: Feb 5, 2020
	 * @version: 1.0
	 * @modifer: Hanh Ha
	 * @modifer_date: Feb 5, 2020
	 */

	public UserGroup() {

	}

}
