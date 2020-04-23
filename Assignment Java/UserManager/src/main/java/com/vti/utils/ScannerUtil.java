package com.vti.utils;

import java.util.Scanner;

import com.mysql.cj.util.StringUtils;

/**
 * 
 * This class is validate input .
 * 
 * @Description: .
 * @author: HVHanh
 * @create_date: Apr 12, 2020
 * @version: 1.0
 * @modifer: HVHanh
 * @modifer_date: Apr 12, 2020
 */

public class ScannerUtil {

	/**
	 * 
	 * This method is enter input Integer.
	 * 
	 * @Description: .
	 * @author: HVHanh
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: HVHanh
	 * @modifer_date: Apr 12, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return
	 */
	public static int readInt(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}

	/**
	 * 
	 * This method is enter input float.
	 * 
	 * @Description: .
	 * @author: HVHanh
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: HVHanh
	 * @modifer_date: Apr 12, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return
	 */
	public static double readDouble(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine());
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}

	/**
	 * 
	 * This method is enter input float.
	 * 
	 * @Description: .
	 * @author: HVHanh
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: HVHanh
	 * @modifer_date: Apr 12, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return
	 */
	public static float readFloat(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine());
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}

	/**
	 * 
	 * This method is enter input String.
	 * 
	 * @Description: .
	 * @author: HVHanh
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: HVHanh
	 * @modifer_date: Apr 12, 2020
	 * @param scanner
	 * @param errorMessage
	 * @return
	 */
	public static String readString(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				String result = scanner.nextLine().trim();
				if (!StringUtils.isNullOrEmpty(result)) {
					return result;
				}
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}

	/**
	 * 
	 * This method show error message when validating.
	 * 
	 * @Description: .
	 * @author: HVHanh
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: HVHanh
	 * @modifer_date: Apr 12, 2020
	 * @param message
	 */
	private static void showError(String message) {
		System.out.println("Error: " + message);
	}

}
