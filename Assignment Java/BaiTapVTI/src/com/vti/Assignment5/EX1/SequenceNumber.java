package com.vti.Assignment5.EX1;

import java.util.Scanner;

public class SequenceNumber {

	private int[] sequences;

	Scanner scan = new Scanner(System.in);

	SequenceNumber() {
		System.out.print("Nhap vao so phan tu : ");
		sequences = new int[scan.nextInt()];
		input();
	}

	public void input() {

		for (int i = 0; i < sequences.length; i++) {
			System.out.println("Nhap vao so thu " + (i + 1) +": ");
			sequences[i] = scan.nextInt();
		}
	}

	public void print() {
		for (int i = 0; i < sequences.length; i++) {
			System.out.print("S" + (i + 1) + ": ");
			System.out.print(sequences[i] + "|");
		}
	}

	public int[] getSequences() {
		return sequences;
	}

}
