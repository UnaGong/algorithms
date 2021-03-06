package util;

import java.util.*;

import util.structure.ListNode;

public class Tool {
	public static void print(int[] list) {
		for (int i : list)
			System.out.print(i + ", ");
		System.out.println();
	}

	public static void print(int[][] matrix) {
		for (int[] row : matrix) {
			for (int num : row) {
				System.out.print((String.valueOf(num).length() == 1 ? " " : "") + num + ",");
			}
			System.out.println();
		}
	}

	public static void print(List<Integer> list) {
		for (int i : list)
			System.out.print(i + ", ");
		System.out.println();
	}

	public static void print(Stack<Integer> stack) {
		System.out.println("From top to bottom:");
		List<Integer> list = new ArrayList<>(stack);
		for (int i = list.size() - 1; i >= 0; i--)
			System.out.print(list.get(i) + ", ");
		System.out.println();
	}

	public static Stack<Integer> getIntStack(int size, int range) {
		Stack<Integer> stack = new Stack<>();
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			stack.push(random.nextInt(range));
		}
		return stack;
	}

	public static int[] getIntArray(int size, int range) {
		int[] array = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++)
			array[i] = random.nextInt(range);
		return array;
	}

	public static int[] getIntArray(int size, int start, int diff, boolean duplicate) {
		int[] array = new int[size];
		array[0] = start;
		Random random = new Random();
		for (int i = 1; i < size; i++)
			array[i] = array[i - 1] + random.nextInt(diff) + (duplicate ? 0 : 1);
		return array;
	}

	public static int[][] getIntMatrix(int row, int col, int range) {
		int[][] matrix = new int[row][col];
		Random random = new Random();
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				matrix[i][j] = random.nextInt(range);
		return matrix;
	}

	public static void print(ListNode head) {
		while (head != null) {
			System.out.print(head.val);
			if (head.next != null)
				System.out.print(" -> ");
			head = head.next;
		}
		System.out.println();
	}
}
