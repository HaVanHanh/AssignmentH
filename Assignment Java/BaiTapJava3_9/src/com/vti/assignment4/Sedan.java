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
public class Sedan extends Car {

	/**
	 * Constructor for class Sedan.
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
	
	protected int length;
	
	/* 
	* @see com.vti.assignment4.Car#getSalePrice()
	*/
	
	@Override
	public double getSalePrice() {
		if(length >20)
			return super.regularPrice*0.05;
		return super.regularPrice*0.1;
	}
	
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

}
