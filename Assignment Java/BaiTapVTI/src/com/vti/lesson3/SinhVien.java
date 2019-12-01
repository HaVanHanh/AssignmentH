package com.vti.lesson3;

import java.util.Scanner;

public class SinhVien {
	Scanner scan 	= new Scanner(System.in);
	String[] ho 	= new String[7];
	String[] tenDem = new String[7];
	String[] ten 	= new String[7];

	
	public void nhap() {
		System.out.println("Nhap 7 ho ");
		for(int i=0;i<ho.length;i++) {
			System.out.println("Nhap ho thu "+(i+1));
			ho[i]= scan.nextLine();
		}
	}
}
