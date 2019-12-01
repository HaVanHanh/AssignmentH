package com.vti.lesson4;

import java.util.Scanner;

public class Car {

	Scanner scan = new Scanner(System.in);
	int speed;
	double regularPrice;
	String color;

	Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.color = color;
		this.regularPrice = regularPrice;
	}

	double getSalePrice() {
		return regularPrice;
	}

	public void nhap() {
		System.out.println("Speed: ");
		speed = scan.nextInt();
		System.out.println("Regular Price: ");
		regularPrice = scan.nextDouble();
		System.out.println("Color: ");
		color = scan.nextLine();
	}

}
