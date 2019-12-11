/**
 * 
 */
package com.vti.assignment6_7;

import java.util.Scanner;

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
public class Employee {
	protected String fullName;
	protected float allowance;
	protected float salary_multiplier;
	protected float salary ;
	Scanner scan = new Scanner(System.in);
	
	protected void input() {
		
		System.out.println("Nhap ho ten day du: ");
		fullName = scan.nextLine();
		fullName.trim();
		System.out.println("Nhap phu cap: ");
		allowance = scan.nextFloat();
		System.out.println("Nhap he so luong: ");
		salary_multiplier = scan.nextFloat();
	}

	protected void print() {
		System.out.println("Ho ten: "+ fullName);
		System.out.println("Phu cap: "+ setAllowance());
		System.out.println("He so luong: "+salary_multiplier);
		

	}
	
	protected double setAllowance() {
		return allowance;
	}
	protected double setSalary() {
		return 0;
	}
}
