//
package com.qlks.utils;

import java.util.regex.Pattern;

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
public class MethodUtil {

	/**
	 * 
	 * check object is null.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 22, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 22, 2019
	 * @param object
	 * @return
	 */
	public static boolean isNull(Object object) {
		return object == null || "".equals(object);
	}

	/**
	 * 
	 * This method is check regular.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 22, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 22, 2019
	 * @param input
	 * @param regular
	 * @return
	 */
	public static boolean checkRegularExpression(String input, String regular) {
		// validate input
		if (isNull(input)) {
			return false;
		}
		// validate success
		return Pattern.compile(regular).matcher(input).matches();
	}
}
