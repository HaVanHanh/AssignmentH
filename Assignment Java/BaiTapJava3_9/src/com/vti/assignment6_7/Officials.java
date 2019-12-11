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
public class Officials extends Employee {

	Position position;
	int workingTime;
	String department;

	/*
	 * @see com.vti.assignment6_7.Employee#input()
	 */

	@Override
	protected void input() {
		super.input();
		System.out.println("Nhap phong ban: ");
		department = scan.nextLine();
		System.out.println("So ngay di lam trong thang: ");
		workingTime = scan.nextInt();
		System.out.println("Vi tri trong truong ");
		int choose = scan.nextInt();

		switch (choose) {
		case 1:
			position = Position.DEPARTMENT_HEAD;
			break;
		case 2:
			position = Position.VICE_HEAD;
			break;
		default:
			position = Position.STAFF;
			break;
		}
	}
	/*
	 * @see com.vti.assignment6_7.Employee#setAllowance()
	 */

	@Override
	protected double setAllowance() {
		if (position == Position.DEPARTMENT_HEAD) {
			return 2000;
		}
		if (position == Position.VICE_HEAD) {
			return 1000;
		}
		if (position == Position.STAFF) {
			return 500;
		}
		return 0;

	}

	/*
	 * @see com.vti.assignment6_7.Employee#setSalary()
	 */

	@Override
	protected double setSalary() {
		return salary_multiplier*730 + allowance + workingTime*30;
	}

	/*
	 * @see com.vti.assignment6_7.Employee#print()
	 */

	@Override
	protected void print() {
		super.print();
		System.out.print("\nPhong ban: "+department);
		System.out.print("\nThoi gian lam viec trong thang(so ngay): "+workingTime);
		System.out.print("\nVi tri trong truong: "+ position);
		System.out.println("\nLuong: "+setSalary());
		
	}
}

enum Position {
	DEPARTMENT_HEAD, VICE_HEAD, STAFF;
}
