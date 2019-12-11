/**
 * 
 */
package com.vti.assignment5.Ex2;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HanhHa
 * @create_date: Dec 8, 2019
 * @version: 1.0
 * @modifer: HanhHa
 * @modifer_date: Dec 8, 2019
 */
public abstract class Employee {
	private String name, address;
	protected int basicSalary;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setAddress(String add) {
		address = add;
	}

	public void setName(String nm) {
		name = nm;
	}

	public void setBasicSalary(int sal) {
		basicSalary = sal;
	}

	public abstract int getMonthlySalary();

}

class NormalEmployee extends Employee {

	/*
	 * @see com.vti.assignment5.Ex2.Employee#getMonthlySalary()
	 */

	int coefficients_salary;

	@Override
	public int getMonthlySalary() {
		return basicSalary * coefficients_salary;
	}

}

class BonusEmployee extends NormalEmployee {

	int reward;

	@Override
	public int getMonthlySalary() {
		return super.getMonthlySalary() * reward;

	}

}
