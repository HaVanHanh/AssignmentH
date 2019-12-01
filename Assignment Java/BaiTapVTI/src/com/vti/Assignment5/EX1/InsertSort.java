package com.vti.Assignment5.EX1;

public class InsertSort implements Sort {

	private int[] sequences;

	InsertSort(int[] sequences) {
		this.sequences = sequences;
	}

	@Override
	public void sort() {
		int temp;
		for (int i = 0; i < sequences.length; i++) {
			for (int j = i + 1; j < sequences.length; j++) {
				if (sequences[i] > sequences[j]) {
					temp = sequences[i];
					sequences[i] = sequences[j];
					sequences[j] = temp;
				}
			}
		}
	}

	public void print() {
		for (int i = 0; i < sequences.length; i++) {
			System.out.print("S" + (i + 1) + ": ");
			System.out.print(sequences[i] + "|");
		}
	}
}