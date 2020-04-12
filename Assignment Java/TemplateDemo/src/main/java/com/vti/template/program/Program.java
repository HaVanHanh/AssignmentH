package com.vti.template.program;

import java.util.Scanner;

import com.vti.template.exception.MyCustomSQLException;
import com.vti.template.utils.Constant;
import com.vti.template.utils.ScannerUtil;
import com.vti.template.utils.validate.Validate;

public class Program {
	public static void main(String[] args) {

		// demo ScannerUntil
		Scanner scanner = new Scanner(System.in);

		System.out.print("moi nhap vao 1 so integer: ");
		int resultInt = ScannerUtil.readInt(scanner, Constant.ERROR_VALIDATE_INT);
		System.out.println("result: " + resultInt);

		System.out.print("moi nhap vao 1 String: ");
		String resultStr = ScannerUtil.readString(scanner, Constant.ERROR_VALIDATE_STRING);
		System.out.println("result: " + resultStr);

		// demo validate by Regular Expression
		try {
			Validate.isEmail("abv@vti.com");

			Validate.isPhone("0932782798");
		} catch (MyCustomSQLException e) {
			System.out.println("Code Validate: " + e.getCode());
			System.out.println("Message Validate: " + e.getMessage());
		}
	}
}
