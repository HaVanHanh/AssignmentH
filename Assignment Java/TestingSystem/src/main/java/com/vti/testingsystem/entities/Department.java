package com.vti.testingsystem.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author -0000-
 *
 */
@Entity
@Table(name = "Department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private short id;

	@Column(name = "name", length = 50, nullable = false, unique = true, insertable = true, updatable = true)
	private String name;

	public short getId() {
		return id;
	}

	public Department setId(short id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Department setName(String name) {
		this.name = name;
		return this;
	}

	public Department(short id, String name) {

		this.id = id;
		this.name = name;
	}

	@OneToMany (mappedBy = "Department")
	private Set<User> user;

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}
	
}
