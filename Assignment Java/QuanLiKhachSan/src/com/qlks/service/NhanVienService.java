/**
 * 
 */
package com.qlks.service;

import java.util.List;

import com.qlks.dto.NhanVienDto;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HanhHa
 * @create_date: Dec 22, 2019
 * @version: 1.0
 * @modifer: HanhHa
 * @modifer_date: Dec 22, 2019
 */
public interface NhanVienService {
	public List<NhanVienDto> getAllNhanVien();

	public NhanVienDto getNhanVieByID(int id);

	public boolean createNhanVien(NhanVienDto dto);

	public boolean updateNhanVien(NhanVienDto dto);

	public boolean deleteNhanVien(String manv);

	public boolean existsNhanVienByMaNV(String manv);

	public boolean existsNhanVienByName(String name);

	public boolean login(String manv, String password);

}
