/**
 * 
 */
package com.vti.testingsystem.entities;

import java.util.Date;

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
@Table(name = "Group", catalog = "TestingSystem")
public class Group {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private short id;

	@Column(name = "name", nullable = false, unique = true, insertable = true, updatable = true)
	private String name;

	@Column(name = "create_time", nullable = false, unique = false, insertable = true, updatable = true)
	private Date createTime;

	/**
	 * @return the id
	 */
	public short getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public Group setId(short id) {
		this.id = id;
		return this;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public Group setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public Group setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	/**
	 * Constructor for class Group.
	 * 
	 * @Description: .
	 * @author: Hanh Ha
	 * @create_date: Feb 5, 2020
	 * @version: 1.0
	 * @modifer: Hanh Ha
	 * @modifer_date: Feb 5, 2020
	 * @param id
	 * @param name
	 * @param createTime
	 */

	public Group(short id, String name, Date createTime) {

		this.id = id;
		this.name = name;
		this.createTime = createTime;
	}

	/**
	 * Constructor for class Group.
	 * 
	 * @Description: .
	 * @author: Hanh Ha
	 * @create_date: Feb 5, 2020
	 * @version: 1.0
	 * @modifer: Hanh Ha
	 * @modifer_date: Feb 5, 2020
	 */

	public Group() {

	}

}
