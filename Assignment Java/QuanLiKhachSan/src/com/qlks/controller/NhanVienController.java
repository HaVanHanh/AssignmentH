/**
 * 
 */
package com.qlks.controller;

import java.util.List;
import java.util.Scanner;

import com.qlks.dto.NhanVienDto;
import com.qlks.service.NhanVienService;
import com.qlks.service.NhanVienServiceImpl;
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
public class NhanVienController {

	private NhanVienService service;

	/**
	 * Constructor for class NhanVienController.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 23, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 23, 2019
	 */
	public NhanVienController() {
		service = new NhanVienServiceImpl();
	}

	/**
	 * 
	 * This method is get all nv.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 23, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 23, 2019
	 * @return
	 */
	public List<NhanVienDto> getAllNhanVien() {

		return service.getAllNhanVien();
	}

	public boolean login(String manv, String password) {
		return service.login(manv, password);
	}

//("NV1",		"Nguyễn Quang Anh",		143336357,		"qanh123@gmail.com",	0337492321,		"NAM",	"Hà Nội",	"Lễ Tân",		"quanh111"),
	public boolean createNhanVien(NhanVienDto dto) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã nhân viên: ");
		dto.setManv(ScannerUtil.readString(scanner));
		return service.createNhanVien(dto);
	}
}
