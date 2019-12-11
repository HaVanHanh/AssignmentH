/**
 * 
 */
package com.vti.assignment6_7;

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
public class Professor extends Employee {

	int monthlyTeachingTime;
	String faculty;

	academic_degree academic;
	/*
	 * @see com.vti.assignment6_7.Employee#input()
	 */

	@Override
	protected void input() {
		academic = new academic_degree();
		super.input();
		System.out.print("\nThoi gian day 1 thang(so gio) = ");
		monthlyTeachingTime = scan.nextInt();
		scan.nextLine();
		System.out.print("\nNang luc: ");
		faculty = scan.nextLine();
		System.out.print("\nTen truong dat cu nhan : ");
		academic.bachelor = scan.nextLine();
		System.out.print("\nTen truong dat cao hoc : ");
		academic.master = scan.nextLine();
		System.out.print("\nTen truong dat tien si : ");
		academic.doctor = scan.nextLine();
		setAllowance();
		setSalary();
	}

	/*
	 * @see com.vti.assignment6_7.Employee#setAllowance()
	 */

	@Override
	protected double setAllowance() {
		if (academic.doctor != null && academic.doctor.length() != 0) {
			return 1000;
		}if (academic.master != null && academic.master.length() != 0) {
			return 500;
		} if (academic.bachelor != null && academic.bachelor.length() != 0) {
			return 500;
		} else {
			return 0;
		}
	}

	/*
	 * @see com.vti.assignment6_7.Employee#setSalary()
	 */

	@Override
	protected double setSalary() {
		return salary_multiplier * 730 + allowance + monthlyTeachingTime * 45;
	}

	@Override
	protected void print() {
		super.print();
		System.out.println("Thoi gian day 1 thang(phut)= " + monthlyTeachingTime);
		System.out.println("Nang luc : " + faculty);
		if (academic.bachelor != null && academic.bachelor.length() != 0) {
			System.out.println("Ten truong ma nguoi nay da dat bang cu nhan: " + academic.bachelor);
		};
		if (academic.master != null && academic.master.length() != 0) {
			System.out.println("Ten truong ma nguoi nay da dat bang cao hoc: " + academic.master);
		};
		if (academic.doctor != null && academic.doctor.length() != 0) {
			System.out.println("Ten truong ma nguoi nay da dat tien si: " + academic.doctor);
		} else {
			System.out.println("Nguoi nay khong co bang cap nao tu bang dai hoc den cao hoc va tien si ca");
		}
		
		System.out.println("Luong = "+ setSalary());
	}

}

class academic_degree {
	String bachelor;
	String master;
	String doctor;

}