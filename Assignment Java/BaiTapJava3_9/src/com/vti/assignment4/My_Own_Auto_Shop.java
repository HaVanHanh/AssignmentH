/**
 * 
 */
package com.vti.assignment4;

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
public class My_Own_Auto_Shop {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhap gia tri cho class Car ");
		System.out.println("Nhap toc do (Speed), Gia ban (regularPrice), Mau cua xe(color): ");
		int speed = scan.nextInt();
		double regularPrice = scan.nextDouble();
		scan.nextLine();
		String color = scan.nextLine();
		Car car = new Car(speed, regularPrice, color);

		System.out.println("Nhap gia tri length cho Sedan");
		int length = scan.nextInt();
		Sedan sedan = new Sedan(speed, regularPrice, color,length);
		
		System.out.println("Nhap gia tri year va manufacturerDiscount cho Ford: ");
		int year = scan.nextInt();
		int manufacturerDiscount = scan.nextInt();
		Ford ford = new Ford(speed, regularPrice, color, year,manufacturerDiscount);
		
		System.out.println("Nhap gia tri weight cho Truck: ");
		int weight = scan.nextInt();
		Truck truck = new Truck(speed, regularPrice, color, weight);

		System.out.println("Gia sale cua Car: "+car.getSalePrice());
		System.out.println("Gia sale cua Sedan: "+sedan.getSalePrice());
		System.out.println("Gia sale cua Ford: "+ ford.getSalePrice());
		System.out.println("Gia sale cua Truck: "+ truck.getSalePrice());
		

	}
}
