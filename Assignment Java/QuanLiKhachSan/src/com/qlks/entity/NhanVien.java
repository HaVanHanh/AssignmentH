/**
 * 
 */
package com.qlks.entity;

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
public class NhanVien {
	private String manv;
	private String tenNV;
	private int cmt;
	private String email;
	private int sdt;
	private boolean gioiTinh;
	private String diaChi;
	private String chucVu;
	private String password;

	/**
	 * Constructor for class NhanVien.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 22, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 22, 2019
	 * @param manv
	 * @param password
	 */
	public NhanVien(String manv, String password) {

		this.manv = manv;
		this.password = password;
	}

	
	/**
	 * Constructor for class NhanVien.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 23, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 23, 2019
	 * @param manv
	 * @param tenNV
	 * @param cmt
	 * @param email
	 * @param sdt
	 * @param gioiTinh
	 * @param diaChi
	 * @param chucVu
	 * @param password
	 */
	public NhanVien(String manv, String tenNV, int cmt, String email, int sdt, boolean gioiTinh, String diaChi,
			String chucVu, String password) {
		super();
		this.manv = manv;
		this.tenNV = tenNV;
		this.cmt = cmt;
		this.email = email;
		this.sdt = sdt;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.chucVu = chucVu;
		this.password = password;
	}


	/**
	 * Constructor for class NhanVien.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 22, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 22, 2019
	 * @param manv
	 * @param tenNV
	 * @param cmt
	 * @param sdt
	 * @param gioiTinh
	 * @param chucVu
	 */
	public NhanVien(String manv, String tenNV, int cmt, int sdt, String chucVu) {

		this.manv = manv;
		this.tenNV = tenNV;
		this.cmt = cmt;
		this.sdt = sdt;

		this.chucVu = chucVu;
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
	public boolean getGioiTinh() {
		return gioiTinh;
	}

	/**
	 * @param gioiTinh the gioiTinh to set
	 */
	public void setGioiTinh(Boolean gioiTinh) {
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
