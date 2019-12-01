package com.vti.assignment6.ex1;

import java.util.Scanner;

public class Employee {

	protected String fullName;
	protected float salaryMultiplier;
	protected float allowance;//
	protected float salary;//
	Scanner scan = new Scanner(System.in);

	public void input() {
		System.out.println("Full name: ");
		fullName = scan.nextLine();
		System.out.println("Salary multiplier: ");
		salaryMultiplier = scan.nextInt();
		scan.nextLine();
	}

	public void print() {
		System.out.println("Full name: " + fullName);
		System.out.println("Salary multiplier: " + salaryMultiplier);
	}

	public float getAllowance() {
		return allowance;
	}

	public void setAllowance(float allowance) {
		this.allowance = allowance;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void setAllowance() {

	}

	public void setSalary() {

	}

}
