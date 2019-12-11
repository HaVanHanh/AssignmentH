/**
 * 
 */
package com.vti.test.generics;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: HanhHa
 * @create_date: Dec 9, 2019
 * @version: 1.0
 * @modifer: HanhHa
 * @modifer_date: Dec 9, 2019
 */
public class Test1 {
	public static void main(String args[]) {
		// Tao cac mang Integer, Double va Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Mang intArray bao gom:");
		printArray(intArray); // truyen mot mang Integer

		System.out.println("\nMang doubleArray bao gom:");
		printArray(doubleArray); // truyen mot mang Double

		System.out.println("\nMang charArray bao gom:");
		printArray(charArray); // truyen mot mang Character
	}

	public static <E> void printArray(E[] inputArray) {
		// Hien thi cac phan tu mang
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();

	}
}
