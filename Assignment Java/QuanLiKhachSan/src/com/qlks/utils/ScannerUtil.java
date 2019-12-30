package com.qlks.utils;

import java.util.Scanner;

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

public class ScannerUtil {

	/**
	 * 
	 * This method is enter input Integer.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 22, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 22, 2019
	 * @param scanner - use Scanner to enter
	 * @return int -- it is a number from user input
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
	 * This method is enter input float.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 22, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 22, 2019
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
	 * This method is enter input float.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 22, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 22, 2019
	 * @param scanner - use Scanner to enter
	 * @return float -- it is a number from user input
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
	 * This method is enter input String.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 22, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 22, 2019
	 * @param scanner -- use Scanner to enter
	 * @return it is a number from user input
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
