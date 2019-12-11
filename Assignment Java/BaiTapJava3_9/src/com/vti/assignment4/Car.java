/**
 * 
 */
package com.vti.assignment4;

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
public class Car {
	protected int speed;
	protected double regularPrice;
	protected String color;

	public double getSalePrice() {
		return regularPrice;
	}

	/**
	 * Constructor for class Car.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 8, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 8, 2019
	 */
	public Car(int speed, double regularPrice, String color) {
		this.color = color;
		this.regularPrice = regularPrice;
		this.speed = speed ;
	}
}
