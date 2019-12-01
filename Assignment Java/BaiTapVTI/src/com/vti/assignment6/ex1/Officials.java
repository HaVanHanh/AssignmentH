package com.vti.assignment6.ex1;

public class Officials extends Employee {
	String department;
	int workingTime;
	Position po;
	int choose;

	@Override
	public void input() {
		super.input();
		System.out.print("\nDepartment: ");
		department = scan.nextLine();
		System.out.print("\nWorking time: ");
		workingTime = scan.nextInt();
		System.out.println("\nPosition: 1:DEPARTMENT_HEAD , 2:  VICE_HEAD, default :STAFF");
		choose = scan.nextInt();
		switch (choose) {
		case 1:
			po = Position.DEPARTMENT_HEAD;
			break;
		case 2:
			po = Position.VICE_HEAD;
			break;
		default:
			po = Position.STAFF;
			break;
		}
		
		setAllowance();
		setSalary();
	}

	@Override
	public void print() {
		super.print();
	}

	@Override
	public void setAllowance() {

		super.setAllowance();
		if(po == Position.DEPARTMENT_HEAD  ) {
			allowance = 2000;
		}
		else if(po == Position.VICE_HEAD ) {
			allowance = 1000;
		}else if(po== po.STAFF) {
			allowance = 500;
		}
	}

	@Override
	public void setSalary() {

		super.setSalary();
	}

}

enum Position {
	DEPARTMENT_HEAD, VICE_HEAD, STAFF;
}