/**
 * 
 */
package com.qlks.service;

import java.util.ArrayList;
import java.util.List;

import com.qlks.dto.NhanVienDto;
import com.qlks.entity.NhanVien;
import com.qlks.repository.NhanVienRepository;
import com.qlks.repository.NhanVienRepositoryImpl;

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
public class NhanVienServiceImpl implements NhanVienService {

	NhanVienRepository repository;

	/*
	 * @see com.qlks.service.NhanVienService#getAllNhanVien()
	 */

	/**
	 * Constructor for class NhanVienServiceImpl.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 23, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 23, 2019
	 */
	public NhanVienServiceImpl() {
		repository = new NhanVienRepositoryImpl();
	}

	@Override
	public List<NhanVienDto> getAllNhanVien() {
		List<NhanVienDto> dtos = new ArrayList<>();
		List<NhanVien> nhanviens = repository.getAll();

		if (null != nhanviens) {

			for (int i = 0; i < nhanviens.size(); i++) {
				dtos.add(new NhanVienDto(nhanviens.get(i)));
			}
		}
		return dtos;
	}

	/*
	 * @see com.qlks.service.NhanVienService#getNhanVieByID(int)
	 */

	@Override
	public NhanVienDto getNhanVieByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @see
	 * com.qlks.service.NhanVienService#createNhanVien(com.qlks.dto.NhanVienDto)
	 */

	@Override
	public boolean createNhanVien(NhanVienDto dto) {
		if (repository.exists(dto.getTenNV())) {
			return false;
		}
		return repository.create(dto.toEntityCreate());
	}

	/*
	 * @see
	 * com.qlks.service.NhanVienService#updateNhanVien(com.qlks.dto.NhanVienDto)
	 */

	@Override
	public boolean updateNhanVien(NhanVienDto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * @see com.qlks.service.NhanVienService#deleteNhanVien(java.lang.String)
	 */

	@Override
	public boolean deleteNhanVien(String manv) {
		if (repository.exists(manv)) {
			return false;
		}
		return repository.delete(manv);

	}

	/*
	 * @see com.qlks.service.NhanVienService#existsNhanVienByMaNV(java.lang.String)
	 */

	@Override
	public boolean existsNhanVienByMaNV(String manv) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * @see com.qlks.service.NhanVienService#existsNhanVienByName(java.lang.String)
	 */

	@Override
	public boolean existsNhanVienByName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * @see com.qlks.service.NhanVienService#login(java.lang.String,
	 * java.lang.String)
	 */

	@Override
	public boolean login(String manv, String password) {
		return repository.login(manv, password);
	}

}
