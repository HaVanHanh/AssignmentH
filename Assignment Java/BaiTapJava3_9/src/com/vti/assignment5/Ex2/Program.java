/**
 * 
 */
package com.vti.assignment5.Ex2;

import java.io.ObjectInputStream.GetField;
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

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BonusEmployee em = new BonusEmployee();

		System.out.println("Nhap ten nhan vien: ");
		em.setName(scan.nextLine());
		System.out.println("Nhap dia chi nhan vien: ");
		em.setAddress(scan.nextLine());
		System.out.println("Nhap luong co ban: ");
		em.setBasicSalary(scan.nextInt());
		System.out.println("Nhap he so luong cua nhan vien: ");
		em.coefficients_salary = scan.nextInt();
		em.getBasicSalary();
		System.out.println("Nhap thuong cua nhan vien: ");
		em.reward = scan.nextInt();
		System.out.println("\n\nHien thi thong tin nhan vien: ");
		System.out.printf("%-20s %20s %20s %20s %20s %20s \n\n", " HoTen", "Dia chi", "Luong co ban",
				"Luong hang thang", "Thuong", "\tLuong nhan duoc thuc te ");

		System.out.printf("%-20s %20s %20s %20s %20s %20s \n\n", em.getName(), em.getAddress(), em.basicSalary,
				em.getMonthlySalary(), em.reward,( em.getMonthlySalary()+em.reward));

	}

}
