package com.vti.lesson4;

public class Truck extends Car {

	Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	int weight;

	double getSalePrice(int weight) {
		if (weight > 2000) {
			return 0.9 * regularPrice;
		} else {
			return 0.9 * regularPrice;
		}
	}
}
