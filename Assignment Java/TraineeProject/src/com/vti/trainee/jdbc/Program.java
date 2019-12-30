/**
 * 
 */
package com.vti.trainee.jdbc;

import java.util.Scanner;

import com.vti.trainee.controller.TraineeController;
import com.vti.trainee.utils.ScannerUtils;

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
public class Program {

	public static void main(String[] args) {
		TraineeController traineeController = new TraineeController();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-----------------");
		//System.out.println(traineeController.getAllTrainee());
		String account, password;

		System.out.print("\nNhap account: ");
		account = ScannerUtils.readString(scanner);
		System.out.print("\nNhap password: ");
		password = ScannerUtils.readString(scanner);
		boolean d = traineeController.login(account, password);
		
		
		if(d == true) {
			System.out.println("\nĐăng nhập thành công");
		}else {
			System.out.println("\nĐăng nhập thất bại ");
		}
		

	}

}
