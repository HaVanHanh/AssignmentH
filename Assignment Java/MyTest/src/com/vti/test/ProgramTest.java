package com.vti.test;

public class ProgramTest {
	public static void main(String[] args) {
		Student.getInstance().setHoTen("hihi");
		System.out.println(Student.getInstance().getHoTen());
	}
}
