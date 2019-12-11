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
public class Truck extends Car {
	/**
	 * Constructor for class Truck.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 8, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 8, 2019
	 * @param speed
	 * @param regularPrice
	 * @param color
	 */
	public Truck(int speed, double regularPrice, String color,int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	protected int weight;
	
	/* 
	* @see com.vti.assignment4.Car#getSalePrice()
	*/
	
	@Override
	public double getSalePrice() {
		if(weight > 2000) 
			return regularPrice*0.9;
		return regularPrice*0.8;
	}
}
