//
package com.vti.utils;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HVHanh
 * @create_date: Apr 12, 2020
 * @version: 1.0
 * @modifer: HVHanh
 * @modifer_date: Apr 12, 2020
 */
public class Validate {
	public boolean isEmail(final String input) {
		// empty
		if (input.isEmpty()) {
			System.out.println("Email is not empty !");
			return false;
		}
		return true;

	}
}
