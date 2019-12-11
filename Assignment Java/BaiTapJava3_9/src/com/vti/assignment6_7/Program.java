/**
 * 
 */
package com.vti.assignment6_7;

import java.util.ArrayList;
import java.util.Scanner;

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
public class Program {

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 8, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 8, 2019
	 * @param args
	 */

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n, choose;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap so luong nhan vien: ");
		n = scan.nextInt();
		ArrayList<Employee> employees = new ArrayList<Employee>(n);
		;

		for (int i = 0; i < n; i++) {

			System.out.println("Moi ban nhap lua chon");
			System.out.println("1: Nhap thong tin nhan vien la giao su");
			System.out.println("2: Nhap thong tin nhan vien la can bo trong nha truong");
			System.out.println("3: thoat");

			choose = scan.nextInt();
			switch (choose) {
			case 1:

				Professor pro = new Professor();
				System.out.println("Nhap thong tin cua giao su");
				pro.input();
				employees.add(pro);
				break;
			case 2:
				Officials officials = new Officials();
				System.out.println("Nhap thong tin cua can bo");

				officials.input();
				employees.add(officials);
				break;
			case 3:
				break;
			}

		}

		// cau 7 tim kiem va sap xep

		System.out.println("\n\n======================------===========================");
		String findName;
		System.out.println("Ten nhan vien ma ban muon nhap vao la: ");
		findName = scan.nextLine();
		findName.trim();
		for (int j = 0; j < n; j++) {
			if (employees.get(j).equals(findName) == true) {
				System.out.println("Nhan vien da tim duoc: " + employees.get(j));
			}
		}

	}

	public void findByName() {

	}

}
