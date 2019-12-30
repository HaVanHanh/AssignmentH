/**
 * 
 */
package com.qlks.repository;

import com.qlks.entity.NhanVien;

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
public interface NhanVienRepository extends Repository<NhanVien> {
	public boolean exists(String name);
}
