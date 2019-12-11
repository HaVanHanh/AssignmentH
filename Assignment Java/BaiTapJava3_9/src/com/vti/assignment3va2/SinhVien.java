/**
 * 
 */
package com.vti.assignment3va2;

import java.util.Random;

import javax.naming.ldap.Rdn;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HanhHa
 * @create_date: Dec 8, 2019
 * @version: 1.0
 * @modifer: HanhHa
 * @modifer_date: Dec 8, 2019
 */
public class SinhVien {

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 8, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 8, 2019
	 * @param args
	 */

	public static void main(String[] args) {
		String[] ho = new String[7];
		String[] tenDem = new String[7];
		String[] ten = new String[7];
		String[] hoTen = new String[10];
		Random ranDom = new Random();
		int[] diem = new int[10];
		String[] ngaySinh = new String[10];
		String[] ID = new String[10];

		ho[0] = "Nguyen ";
		ho[1] = "Vu";
		ho[2] = "Pham";
		ho[3] = "Hoang ";
		ho[4] = "Ha";
		ho[5] = "Nhu";
		ho[6] = "Pham";

		tenDem[0] = "Van";
		tenDem[1] = "Thi";
		tenDem[2] = "Mai";
		tenDem[3] = "Hoang";
		tenDem[4] = "Nguyen";
		tenDem[5] = "Lan";
		tenDem[6] = "Khanh";

		ten[0] = "Truong";
		ten[1] = "Khoa";
		ten[2] = "Ngoc";
		ten[3] = "Thao";
		ten[4] = "Huong";
		ten[5] = "Tuan";
		ten[6] = "Huynh";

		ID[0] = "SV0000001";
		ID[9] = "SV0000002";
		ID[8] = "SV0000003";
		ID[7] = "SV0000004";
		ID[6] = "SV0000005";
		ID[5] = "SV0000006";
		ID[4] = "SV0000007";
		ID[3] = "SV0000008";
		ID[2] = "SV0000009";
		ID[1] = "SV0000010";

		// khoi tao ngay sinh cho sinh vien voi yeu cau tao 10 ngay sinh tu 01/02/1991
		// den 31/12/1991

		int ngayCuaThang2 = ranDom.nextInt(29); // thang 2 nam 1991 co 28 ngay

		int[] thangCo31Ngay = { 3, 5, 7, 8, 10, 12 };

		int[] thangCo30Ngay = { 4, 6, 9, 11 };

		for (int i = 0; i < 5; i++) {
			ngaySinh[i] = (ranDom.nextInt(30) + 1) + "-" + thangCo30Ngay[ranDom.nextInt(4)] + "-" + "1991";
		}

		for (int i = 5; i <= 9; i++) {
			ngaySinh[i] = (ranDom.nextInt(31) + 1) + "-" + thangCo31Ngay[ranDom.nextInt(4)] + "-" + "1991";
		}

		for (int i = 0; i < hoTen.length; i++) {
			hoTen[i] = ho[ranDom.nextInt(7)] + " " + tenDem[ranDom.nextInt(7)] + " " + ten[ranDom.nextInt(7)];
		}

		/*
		 * 
		 * Tao diem cua sinh vien ( cau 3 ) Moi mon co 1 sv diem tu 8 den 10 3 sv diem
		 * tu 5 den 7 3 sv diem 3 den 4 2 sv 1 hoac 2 1 sinh vien diem la 0
		 * 
		 */

		int diem8Den10;
		int[] diem5Den7 = new int[3];
		int[] diem3Den4 = new int[3];
		int[] diem1Hoac2 = new int[2];
		int diem0 = 0;

		/*
		 * diem8Den10 = ranDom.nextInt(10-8+1)+8;
		 * 
		 * for (int i = 0; i < 3; i++) { diem5Den7[i] = ranDom.nextInt(7-5+1)+5;
		 * diem3Den4[i] = ranDom.nextInt(4-3+1)+3; }
		 * 
		 * for(int i=0; i<2 ;i++) { diem1Hoac2[i] = ranDom.nextInt(2-1+1)+1; }
		 * 
		 * //gan diem
		 */
		int RA[] = new int[10];
		int SD[] = new int[10];
		int CP[] = new int[10];
		int CUT[] = new int[10];
		int FMT[] = new int[10];
		float AVG[] = new float[10];

		for (int i = 0; i < 3; i++) {
			RA[i] = (ranDom.nextInt(7 - 5 + 1) + 5);
			SD[i] = (ranDom.nextInt(7 - 5 + 1) + 5);
			CP[i] = (ranDom.nextInt(7 - 5 + 1) + 5);
			CUT[i] = (ranDom.nextInt(7 - 5 + 1) + 5);
			FMT[i] = (ranDom.nextInt(7 - 5 + 1) + 5);
		}
		for (int i = 3; i < 6; i++) {
			RA[i] = (ranDom.nextInt(4 - 3 + 1) + 3);
			SD[i] = (ranDom.nextInt(4 - 3 + 1) + 3);
			CP[i] = (ranDom.nextInt(4 - 3 + 1) + 3);
			CUT[i] = (ranDom.nextInt(4 - 3 + 1) + 3);
			FMT[i] = (ranDom.nextInt(4 - 3 + 1) + 3);

		}
		for (int i = 6; i < 8; i++) {
			RA[i] = ranDom.nextInt(2 - 1 + 1) + 1;
			SD[i] = ranDom.nextInt(2 - 1 + 1) + 1;
			CP[i] = ranDom.nextInt(2 - 1 + 1) + 1;
			CUT[i] = ranDom.nextInt(2 - 1 + 1) + 1;
			FMT[i] = ranDom.nextInt(2 - 1 + 1) + 1;

		}

		RA[8] = ranDom.nextInt(10 - 8 + 1) + 8;
		SD[8] = ranDom.nextInt(10 - 8 + 1) + 8;
		CP[8] = ranDom.nextInt(10 - 8 + 1) + 8;
		CUT[8] = ranDom.nextInt(10 - 8 + 1) + 8;
		FMT[8] = ranDom.nextInt(10 - 8 + 1) + 8;

		RA[9] = 0;
		SD[9] = 0;
		CP[9] = 0;
		CUT[9] = 0;
		FMT[9] = 0;

		
		for (int i = 0; i < 10; i++) {
			int tong = 0;
			tong = RA[i]+ SD[i]+ CP[i] +CUT[i]+ FMT[i];
			AVG[i] = (float) tong / 5;
		}

		System.out.printf("%-20s %20s %20s %10s %10s %10s %10s %10s %10s\n\n", "Full name", "Birth date", "ID", "RA",
				"SD", "CP", "CUT", "FMT", "AVG");
		for (int i = 0; i < hoTen.length; i++) {
			System.out.printf("%-20s %20s %20s %10s %10s %10s %10s %10s %10s\n\n", hoTen[i], ngaySinh[i], ID[i], RA[i],
					SD[i], CP[i], CUT[i], FMT[i], AVG[i]);
			// System.out.println(ranDom.nextInt(3)+1);
		}

	}

}
