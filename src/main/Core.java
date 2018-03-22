package main;

import algorithms.*;

public class Core {
	public static void main(String[] args) {
		int[] list = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
//		int[] list = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 };
		QuickSort.quickSort(list);
		print(list);
	}

	public static void print(int[] list) {
		for (int i : list)
			System.out.print(i + " ");
	}
}
