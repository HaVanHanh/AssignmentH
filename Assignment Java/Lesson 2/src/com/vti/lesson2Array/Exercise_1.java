package com.vti.lesson2Array;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.UUID;

public class Exercise_1{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Exercise 1:
		1 trường đại học cần 1 phần mềm để quản lý điểm của sinh viên. Bạn đang làm việc
		như người lập trình viên và bạn phải xây dựng 1 chương trình đáp ứng được các yêu
		cầu sau:
		1. Tạo tên của sinh viên:
		a. Tạo 1 array có chứa 7 họ của sinh viên (tên của sinh viên không chứa
		dấu)
		b. Tạo 1 array có chứa 7 tên đệm của sinh viên (tên đệm của sinh viên
		không chứa dấu)
		c. Tạo 1 array có chứa 7 tên của sinh viên (tên của sinh viên không chứa
		dấu)
		Tạo 10 tên đầy đủ của sinh viên (bao gồm 1 họ, 1 tên đệm và 1 tên) và đặt
		chúng vào trong 1 array mới. (Các tên phải khác nhau từng đôi một).*/



		String[] ho		= new String[7];
		
		ho[0]	="Nguyen";
		ho[1]	="Chu";
		ho[2]	="Pham";
		ho[3]	="Huynh";
		ho[4]	="Ta";
		ho[5]	="Vu";
		ho[6]	="Ha";
		
		
		String[] tenDem = new String[] {"Hoang","Thi","Van","Xuan","Lan","Ngoc","Van"};
		
		String[] ten	= new String[] {"Long","Mai","Hieu","Truong","Huong","Hai","Huy"};
		

		/*
		 * 2. Tạo ID của sinh viên: Tạo 10 ID của sinh viên. ID bao gồm “SV” + 7 số và
		 * ID của mỗi sinh viên là duy nhất.
		 */ 
		String[] ID = new String[] {"SV"+"1710311",	"SV"+"1710312",	"SV"+"1710313",	"SV"+"1710314",
									"SV"+"1710315",	"SV"+"1710316",	"SV"+"1710317",	"SV"+"1710318",
									"SV"+"1710319",	"SV"+"1710310"};
		
		/*
		 * 3. Tạo ngày sinh của sinh viên: Tạo 10 ngày sinh của sinh viên nằm trong
		 * khoảng 01/02/1991 và 31/12/1991. Ngày sinh của mỗi sinh viên là duy nhất.
		 */
		
		String[] birthDate		= new String[10];
		birthDate[0] ="1999-05-02";
		birthDate[1] ="1999-05-03";
		birthDate[2] ="1999-05-04";
		birthDate[3] ="1999-05-05";
		birthDate[4] ="1999-05-06";
		birthDate[5] ="1999-05-07";
		birthDate[6] ="1999-05-08";
		birthDate[7] ="1999-05-09";
		birthDate[8] ="1999-05-10";
		birthDate[9] ="1999-05-11";
	
		String[] tenSV = new String[10];
		
		tenSV[0] = ho[0] +" "+ tenDem[0]+" "+ ten[0];
		tenSV[1] = ho[1] +" "+ tenDem[1]+" "+ ten[1];
		tenSV[2] = ho[2] +" "+ tenDem[2]+" "+ ten[2];
		tenSV[3] = ho[3] +" "+ tenDem[3]+" "+ ten[3];
		tenSV[4] = ho[4] +" "+ tenDem[4]+" "+ ten[4];
		tenSV[5] = ho[5] +" "+ tenDem[5]+" "+ ten[5];
		tenSV[6] = ho[6] +" "+ tenDem[6]+" "+ ten[6];
		tenSV[7] = ho[0] +" "+ tenDem[1]+" "+ ten[1];
		tenSV[8] = ho[1] +" "+ tenDem[0]+" "+ ten[0];
		tenSV[9] = ho[2] +" "+ tenDem[0]+" "+ ten[0];

		System.out.println("FullName"+"  "+"ID"+"  "+"Birth Date");
		for(int i=0;i<tenSV.length;i++) {
			System.out.println(tenSV[i]+ "  "+ ID[i]+"  " +birthDate[i]);
		}
		
	}
}
