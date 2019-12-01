package com.vti.Assignment5.EX1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input value
		SequenceNumber sequences = new SequenceNumber();
		System.out.println("\nMang sau khi nhap la :");
		sequences.print();

		Sort sortMethod;
		System.out.println("\nBan muon sort theo kieu nao:");
		switch (scan.nextInt()) {
		case 1:
			sortMethod = new InsertSort(sequences.getSequences());
			break;
		case 2:
			sortMethod = new InsertSort(sequences.getSequences());
			break;
		default:
			sortMethod = new InsertSort(sequences.getSequences());
			break;
		}

		sortMethod.sort();
		System.out.println("\n\nMang sau khi dung insert sort la: ");
		sortMethod.print();

	}

}
