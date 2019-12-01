package com.vti.lesson4;

public class Sedan extends Car {

	int length;

	Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;

	}

	double getSalePrice() {
		if (length > 20) {
			return 0.95 * regularPrice;
		} else {
			return 0.9 * regularPrice;
		}
	}

}
