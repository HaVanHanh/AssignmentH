package com.vti.test;

public class Student {

	private String hoTen;
	private static Student instance = new Student();

	private Student() {

	}

	public static Student getInstance() {
		if (null == instance) {
			instance = new Student();
		}
		return instance;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
}
