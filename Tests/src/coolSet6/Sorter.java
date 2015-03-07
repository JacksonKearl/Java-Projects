package coolSet6;

import java.util.*;

public class Sorter {

	public static boolean verbose;

	public static <T extends Comparable<T>> void insertionSort(SlickList<T> list) {
		for (int i = 1; i < list.size(); i++) {
			T insVal = list.get(i);
			list.remove(i);

			int j = i;
			while (j > 0 && list.get(j - 1).compareTo(insVal) > 0) {
				list.totalSwaps++;
				j--;
			}

			list.add(j, insVal);
			print(list);
		}
	}

	public static <T extends Comparable<T>> void selectionSort(SlickList<T> list) {
		for (int i = 0; i < list.size(); i++) {
			int possibleSmallest = i;

			for (int j = i; j < list.size(); j++) {
				if (list.get(possibleSmallest).compareTo(list.get(j)) > 0)
					possibleSmallest = j;
			}

			swap(list, i, possibleSmallest);
			print(list);
		}
	}

	public static void shuffle(SlickList<?> list) {
		for (int i = list.size() - 1; i > 1; i--) {
			swap(list, i, (int) (Math.random() * (i + 1)));
		}
	}

	private static <T> void print(ArrayList<T> arr) {
		if (verbose) {
			for (T item : arr)
				System.out.print(item.toString() + " ");
			System.out.println();
		}
	}

	private static <T> void swap(SlickList<T> list, int a, int b) {
		T temp = list.get(a);
		list.totalSwaps++;
		list.set(a, list.get(b));
		list.set(b, temp);
	}

	public static void main(String args[]) {
		int size = 100;
		verbose = (size < 15);
		SlickList<Item> list = Item.makeList(size);

		print(list);
		System.out.println("\nInsertion sort:");
		insertionSort(list);
		System.out.println(list.totalComps + " total comparisons");
		System.out.println(list.totalSwaps
				+ " total swaps (if implemented as array)");
		list.totalComps = 0;
		list.totalSwaps = 0;

		if (verbose) System.out.println("\nShuffled:");
		shuffle(list);
		print(list);
		list.totalSwaps = 0;

		System.out.println("\nSelection Sort:");
		selectionSort(list);
		print(list);
		System.out.println(list.totalComps + " total comparisons");
		System.out.println(list.totalSwaps + " total swaps");
		list.totalComps = 0;
	}
}