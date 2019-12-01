package com.vti.lesson4;

public class Ford extends Car {

	int year;
	int manufacturerDiscount;

	Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		// TODO Auto-generated constructor stub
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	double getSalePrice() {
		return (float) super.getSalePrice() - manufacturerDiscount;
	}
}
