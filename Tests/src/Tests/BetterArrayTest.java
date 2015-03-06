package Tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BetterArrayTest {

	public static void main(String[] args) {
		int[] list = new int[100];
		System.out.println();
		makeList(list);
		System.out.print("\n" + "The original (unsorted) list is:" + "\n");
		showArray(list);
		int minIndex = findIndexOfMin(list);
		int maxIndex = findIndexOfMax(list);
		System.out.print("\n\n" + "The minimum value is: list[" + minIndex
				+ "] = " + list[minIndex] + "\n"
				+ "The maximum value is: list[" + maxIndex + "] = "
				+ list[maxIndex]);
		System.out
				.print("\n-------------------------------------------------------");
		System.out
				.print("---------------------------------------------------------");
		System.out.print("\n\n" + "The new (sorted) list is:" + "\n");
		sort(list);
		showArray(list);
		minIndex = findIndexOfMin(list);
		maxIndex = findIndexOfMax(list);
		System.out.print("\n\n" + "The minimum value is: list[" + minIndex
				+ "] = " + list[minIndex] + "\n"
				+ "The maximum value is: list[" + maxIndex + "] = "
				+ list[maxIndex]);
		System.out
				.print("\n--------------------------------------------------------");
		System.out
				.print("----------------------------------------------------------");
		ArrayList<Integer> primes = findPrimes(list);
		System.out.print("\n\n" + "The primes are: ");
		showArrayList(primes);

	}

	/**
	 * Must fort initialize a whole new ArrayList, because I didn't want to write
	 * a decent sorting algorithm. But because of this, runs in O(Nlog(n)) as
	 * opposed to O(N^2). Space complexity however increase from O(1) to O(N).
	 * 
	 * @param list
	 */
	private static void sort(int[] list) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int i : list) {
			arrList.add(i);
		}
		Collections.sort(arrList);

		for (int i = 0; i < list.length; i++) {
			list[i] = arrList.get(i);
		}
	}

	private static void showArrayList(ArrayList<Integer> primes) {
		for (Integer i : primes) {
			System.out.print(i + " ");
		}

	}

	private static ArrayList<Integer> findPrimes(int[] list) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i : list) {
			if (isPrime(i, 300))
				primes.add(i);
		}
		return primes;
	}

	private static boolean isPrime(int i, int max) {
		int maxTest = (int) Math.sqrt(max);
		for (int j = 2; j < maxTest; j++) {
			if (i % j == 0)
				return false;
		}
		return true;
	}

	private static int findIndexOfMax(int[] list) {
		int possibleMaxIndex = 0;
		for (int i = 1; i < list.length; i++) {
			if (list[i] > list[possibleMaxIndex])
				possibleMaxIndex = i;
		}
		return possibleMaxIndex;
	}

	private static int findIndexOfMin(int[] list) {
		int possibleMinIndex = 0;
		for (int i = 1; i < list.length; i++) {
			if (list[i] < list[possibleMinIndex])
				possibleMinIndex = i;
		}
		return possibleMinIndex;
	}

	private static void showArray(int[] list) {
		int column = 0;
		for (int i : list) {
			System.out.print(i + "\t");
			column++;
			if ((column % 10) == 0)
				System.out.println();
		}
	}

	/**
	 * Uses a HashMap to check for doubles. This allows finding if the value is
	 * in the list in O(1) as opposed to O(N) or O(ln(N)) time.
	 * 
	 * @param list
	 *            will be filled with random, non repeating integers from 100 to
	 *            200
	 */
	private static void makeList(int[] list) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int i = 0; i < list.length;) {
			int possibleAdd = (int) ((Math.random() * 200) + 100);
			if (!map.containsKey(possibleAdd)) {
				map.put(possibleAdd, true);
				list[i] = possibleAdd;
				i++;
			}
		}

	}

}
