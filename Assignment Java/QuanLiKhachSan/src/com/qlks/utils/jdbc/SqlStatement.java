package com.qlks.utils.jdbc;

/**
 * 
 * This class is .
 * 
 * @Description: .
 * @author: HanhHa
 * @create_date: Dec 22, 2019
 * @version: 1.0
 * @modifer: HanhHa
 * @modifer_date: Dec 22, 2019
 */
public class SqlStatement {

	// nhanvien
	public static final String SELECT_ALL_NHANVIEN = "SELECT 	MANV, TENNV, CMT, SDT,  CHUCVU " + "FROM 	NHANVIEN";
	public static final String LOGIN_NHANVIEN = "SELECT 	MANV,PASSWORD "
			+ "FROM NHANVIEN 	WHERE MANV =? AND PASSWORD =?";

	// ("NV1","Nguyễn Quang Anh",143336357,"qanh123@gmail.com",0337492321,"NAM", "Hà
	// Nội","Lễ Tân","quanh111"),
	public static final String CREATE_NHANVIEN = "INSERT INTO NHANVIEN VALUES(?,?,?,?,?,?,?,?,?)";
	public static final String DELETE_NHANVIEN = "DELETE FROM NHANVIEN WHERE MANV=?";
}
