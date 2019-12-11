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
public class Ford extends Car {
	/**
	 * Constructor for class Ford.
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
	public Ford(int speed, double regularPrice, String color, int year,int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	int year;
	int manufacturerDiscount;

	/* 
	* @see com.vti.assignment4.Car#getSalePrice()
	*/
	
	@Override
	public double getSalePrice() {
		return super.regularPrice - this.manufacturerDiscount;
	}
}
