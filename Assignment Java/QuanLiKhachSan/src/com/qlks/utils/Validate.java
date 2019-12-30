//
package com.qlks.utils;

/**
 * 
 * This class is .
 * 
 * @Description: .
 * @author: HanhHa
 * @create_date: Dec 22, 2019
 * @version: 1.0
 * @modifer: HanhHa
 * @modifer_date: Dec 22, 2019
 */
public class Validate {

	/**
	 * 
	 * This method is check validate email.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 22, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 22, 2019
	 * @param input
	 * @return
	 */
	public static boolean isEmail(final String input) {
		return MethodUtil.checkRegularExpression(input, Constant.PATTERN_EMAIL);
	}

	/**
	 * 
	 * This method is check validate phone.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 22, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 22, 2019
	 * @param input
	 * @return
	 */
	public static boolean isPhone(final String input) {
		return MethodUtil.checkRegularExpression(input, Constant.PATTERN_PHONE);
	}

}
