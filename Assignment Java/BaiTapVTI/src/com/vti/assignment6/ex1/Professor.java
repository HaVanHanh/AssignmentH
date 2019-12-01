package com.vti.assignment6.ex1;

public class Professor extends Employee {
	String faculty;
	AcademicDegree academicDegree;
	int monthly_teaching_time;
	int choose;

	public Professor() {
		super();
		academicDegree = new AcademicDegree();
	}

	@Override
	public void input() {
		super.input();
		System.out.println("----Academic Degree---- ");
		System.out.print("\nIn4 bachelor:");
		academicDegree.bachelor = scan.nextLine();
		System.out.print("\nIn4 master:");
		academicDegree.master = scan.nextLine();
		System.out.print("\nIn4 doctor:");
		academicDegree.doctor = scan.nextLine();
		System.out.print("\nmonthly_teaching_time: ");
		monthly_teaching_time = scan.nextInt();
		
		setAllowance();
		setSalary();
	}

	@Override
	public void setAllowance() {
		if (academicDegree.bachelor != null) {
			allowance = 300;
		} else if (academicDegree.bachelor != null && academicDegree.master != null) {
			allowance = 500;
		} else if (academicDegree.bachelor != null && academicDegree.master != null && academicDegree.doctor != null) {
			allowance = 1000;
		}
	}

	@Override
	public void setSalary() {
		salary = salaryMultiplier * 730 + allowance + monthly_teaching_time * 45;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("salary :" + salary);
	}

}

class AcademicDegree {
	String bachelor;
	String master;
	String doctor;
}