/**
 * 
 */
package com.qlks.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.qlks.entity.NhanVien;
import com.qlks.utils.jdbc.SqlParameter;
import com.qlks.utils.jdbc.SqlStatement;

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
public class NhanVienRepositoryImpl extends RepositoryImpl<NhanVien> implements NhanVienRepository {

	/*
	 * @see com.qlks.repository.Repository#getAll()
	 */

	@Override
	public List<NhanVien> getAll() {

		List<NhanVien> entities = new ArrayList<>();
		ResultSet result = getJdbc().selectStatement(SqlStatement.SELECT_ALL_NHANVIEN);
		if (null == result) {
			getJdbc().disconnect();
			return null;
		}

		try {
			while (result.next()) {
				entities.add(new NhanVien(result.getString("MANV"), result.getString("TENNV"), result.getInt("CMT"),
						result.getInt("SDT"), result.getString("ChucVu")));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getJdbc().disconnect();
		return entities;

	}

	/*
	 * @see com.qlks.repository.Repository#getByID(int)
	 */

	@Override
	public NhanVien getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @see com.qlks.repository.Repository#create(java.lang.Object)
	 */

	@Override
	public boolean create(NhanVien entity) {
		List<SqlParameter> params = new ArrayList<>();

		params.add(new SqlParameter(1, entity.getManv()));
		params.add(new SqlParameter(2, entity.getTenNV()));
		params.add(new SqlParameter(3, entity.getCmt()));
		params.add(new SqlParameter(4, entity.getEmail()));
		params.add(new SqlParameter(5, entity.getSdt()));
		params.add(new SqlParameter(6, entity.getGioiTinh()));
		params.add(new SqlParameter(7, entity.getDiaChi()));
		params.add(new SqlParameter(8, entity.getChucVu()));
		params.add(new SqlParameter(9, entity.getPassword()));

		int result = getJdbc().updatePreparationStatement(SqlStatement.CREATE_NHANVIEN, params);
		if (result == 1) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * @see com.qlks.repository.Repository#update(java.lang.Object)
	 */

	@Override
	public boolean update(NhanVien entity) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * @see com.qlks.repository.Repository#delete(java.lang.String)
	 */

	@Override
	public boolean delete(String manv) {
		List<SqlParameter> params = new ArrayList<>();
		params.add(new SqlParameter(1, manv));

		// execute query
		int result = getJdbc().updatePreparationStatement(SqlStatement.DELETE_NHANVIEN, params);
		getJdbc().disconnect();

		// return result
		if (result == 1) {
			return true;
		}
		return false;
	}

	/*
	 * @see com.qlks.repository.Repository#login(java.lang.String, java.lang.String)
	 */

	@Override
	public boolean login(String manv, String password) {

		List<SqlParameter> params = new ArrayList<>();
		params.add(new SqlParameter(1, manv));
		params.add(new SqlParameter(2, password));

		ResultSet result = getJdbc().selectPreparationStatement(SqlStatement.LOGIN_NHANVIEN, params);

		if (result == null) {
			getJdbc().disconnect();
			return false;
		}
		try {
			while (result.next()) {
				getJdbc().disconnect();
				return true;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getJdbc().disconnect();
		return false;
	}

	/*
	 * @see com.qlks.repository.NhanVienRepository#exists(java.lang.String)
	 */

	@Override
	public boolean exists(String name) {
		// TODO Auto-generated method stub
		return false;
	}
}
