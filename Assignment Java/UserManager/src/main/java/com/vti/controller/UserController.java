//
package com.vti.controller;

import java.util.Scanner;

import com.vti.form.LoginForm;
import com.vti.service.UserService;
import com.vti.service.UserServiceImpl;
import com.vti.utils.Constant;
import com.vti.utils.ScannerUtil;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HVHanh
 * @create_date: Apr 12, 2020
 * @version: 1.0
 * @modifer: HVHanh
 * @modifer_date: Apr 12, 2020
 */
public class UserController {

	UserService service;
	Scanner scan = new Scanner(System.in);

	public void Login() {
		service = new UserServiceImpl();
		String email;
		String password;

		System.out.println("Nhap email: ");
		email = ScannerUtil.readString(scan, Constant.ERROR_VALIDATE_STRING);

		System.out.println("Nhap password : ");
		password = ScannerUtil.readString(scan, Constant.ERROR_VALIDATE_STRING);

		LoginForm form = new LoginForm(email, password);
		
		
		service.login();
	}

}
