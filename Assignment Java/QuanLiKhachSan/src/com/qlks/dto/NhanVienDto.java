/**
 * 
 */
package com.qlks.dto;

import com.qlks.dto.GioiTinh.GT;
import com.qlks.entity.NhanVien;
import com.qlks.utils.Constant;

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
public class NhanVienDto {
	private String manv;
	private String tenNV;
	private int cmt;
	private String email;
	private int sdt;
	private GT gioiTinh;
	private String diaChi;
	private String chucVu;
	private String password;

	/**
	 * Constructor for class NhanVienDto.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 22, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 22, 2019
	 */
	public NhanVienDto(NhanVien nhanVien) {

		this.chucVu = nhanVien.getChucVu();
		this.cmt = nhanVien.getCmt();
		this.diaChi = nhanVien.getDiaChi();
		this.email = nhanVien.getEmail();
		if (nhanVien.getGioiTinh() == true) {
			this.gioiTinh = GioiTinh.GT.NAM;
		}
		if (nhanVien.getGioiTinh() == true) {
			this.gioiTinh = GioiTinh.GT.NỮ;
		}
		this.manv = nhanVien.getManv();
		this.password = nhanVien.getManv();
		this.sdt = nhanVien.getSdt();
		this.tenNV = nhanVien.getTenNV();
	}

	public NhanVien toEntityCreate() {
		boolean gioiTinh;
		if (this.gioiTinh == GT.NAM) {
			gioiTinh = true;
		} else {
			gioiTinh = false;
		}
		return new NhanVien(this.manv, this.tenNV, this.cmt, this.email, this.sdt, gioiTinh , this.diaChi,this.chucVu, this.password);
	}

	/**
	 * @return the manv
	 */
	public String getManv() {
		return manv;
	}

	/**
	 * @param manv the manv to set
	 */
	public void setManv(String manv) {
		this.manv = manv;
	}

	/**
	 * @return the tenNV
	 */
	public String getTenNV() {
		return tenNV;
	}

	/**
	 * @param tenNV the tenNV to set
	 */
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	/**
	 * @return the cmt
	 */
	public int getCmt() {
		return cmt;
	}

	/**
	 * @param cmt the cmt to set
	 */
	public void setCmt(int cmt) {
		this.cmt = cmt;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the sdt
	 */
	public int getSdt() {
		return sdt;
	}

	/**
	 * @param sdt the sdt to set
	 */
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}

	/**
	 * @return the gioiTinh
	 */
	public GT getGioiTinh() {
		return gioiTinh;
	}

	/**
	 * @param gioiTinh the gioiTinh to set
	 */
	public void setGioiTinh(GT gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}

	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	/**
	 * @return the chucVu
	 */
	public String getChucVu() {
		return chucVu;
	}

	/**
	 * @param chucVu the chucVu to set
	 */
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}

class GioiTinh {
	enum GT {
		NAM, NỮ;
	}
}
