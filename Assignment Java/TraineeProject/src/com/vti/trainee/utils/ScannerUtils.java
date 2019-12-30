/**
 * 
 */
package com.vti.trainee.utils;

import java.util.Scanner;


/**
 * This class is .
 * 
 * @Description: .
 * @author: HanhHa
 * @create_date: Dec 21, 2019
 * @version: 1.0
 * @modifer: HanhHa
 * @modifer_date: Dec 21, 2019
 */
public class ScannerUtils {
	/**
	 * 
	 * This method is .
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 21, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 21, 2019
	 * @param scanner
	 * @return
	 */
	public static int readInt(Scanner scanner) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				System.out.println(Constant.ERROR_VALIDATE_INT);
			}
		}
	}

	/**
	 * 
	 * This method is .
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 21, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 21, 2019
	 * @param scanner
	 * @return
	 */
	public static double readDouble(Scanner scanner) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine());
			} catch (Exception e) {
				System.out.println(Constant.ERROR_VALIDATE_DOUBLE);
			}
		}
	}

	/**
	 * 
	 * This method is .
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 21, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 21, 2019
	 * @param scanner
	 * @return
	 */
	public static float readFloat(Scanner scanner) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine());
			} catch (Exception e) {
				System.out.println(Constant.ERROR_VALIDATE_FLOAT);
			}
		}
	}

	/**
	 * 
	 * This method is .
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 21, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 21, 2019
	 * @param scanner
	 * @return
	 */
	public static String readString(Scanner scanner) {
		while (true) {
			try {
				String result = scanner.nextLine().trim();
				if (result != null && !result.isEmpty()) {
					return result;
				}
			} catch (Exception e) {
				System.out.println(Constant.ERROR_VALIDATE_STRING);
			}
		}
	}

}
