/**
 * 
 */
package com.qlks.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qlks.controller.NhanVienController;
import com.qlks.dto.NhanVienDto;
import com.qlks.utils.ScannerUtil;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HanhHa
 * @create_date: Dec 23, 2019
 * @version: 1.0
 * @modifer: HanhHa
 * @modifer_date: Dec 23, 2019
 */
public class Program {

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 23, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 23, 2019
	 * @param args
	 */

	public static void main(String[] args) {

		NhanVienController controllerNV = new NhanVienController();
		List<NhanVienDto> dtos = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		String maNV = null, pass = null;

		/**
		 * Login 
		 */
		System.out.println("---MỜI BẠN ĐĂNG NHẬP---");
		System.out.println("Nhập mã nv và password");
		maNV = scan.nextLine();
		pass = scan.nextLine();
		boolean sttLogin = controllerNV.login(maNV, pass);

		while (sttLogin == false) {
			System.out.println("Mời đăng nhập lại");
			maNV = scan.nextLine();
			pass = scan.nextLine();
			sttLogin = controllerNV.login(maNV, pass);
		}
		if (sttLogin == true) {
			System.out.println("Đăng nhập thành công");
		}

		dtos = controllerNV.getAllNhanVien();
		System.out.println("-----------HIỂN THỊ TOÀN BỘ NHÂN VIÊN CỦA HỆ THỐNG-----------");
		for (int i = 0; i < dtos.size(); i++) {
			System.out.println(dtos.get(i).getManv() + "  " + dtos.get(i).getTenNV());
		}
	}

}
