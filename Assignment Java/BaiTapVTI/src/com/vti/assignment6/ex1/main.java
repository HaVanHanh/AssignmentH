package com.vti.assignment6.ex1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		int n, choose;
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of employees: ");
		n = scan.nextInt();
		Employee[] em = new Employee[n] ;
		

		for(int i=0; i<n ;i++) {
			System.out.println("In4 of employee"+(i+1));
			System.out.println("1: Professor, 2: Officials");
			choose = scan.nextInt();
			switch (choose) {
			case 1:
				em[i]= new Professor();
				em[i].input();
				break;
			case 2:
				em[i] = new Officials();
				em[i].input();
			default:
				break;
			}
		}
		
		for(int i=0;i<n ;i++) {
			System.out.println("Employee "+(i+1));
			em[i].print();
		}
		
	}
}
