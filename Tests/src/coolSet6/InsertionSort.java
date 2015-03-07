package coolSet6;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 8, 3, 7, 1, 9, 3, 2 };
		print(arr);

		for (int i = 1; i < arr.length; i++) {
			sortInsert(arr, i);
			print(arr);
		}

	}

	/**
	 * Takes the i'th element of the array and inserts in the proper position in
	 * a presumably sorted front of array. Shifts all other elements over to
	 * accommodate.
	 * <P>
	 * Runs in O(k), where k is distance element is from its
	 * proper position.
	 */
	private static void sortInsert(int[] arr, int i) {
		int insVal = arr[i];    // store value to insert
		while (i > 0) {
			arr[i] = arr[i - 1];     // shift values at head over by 1
			if (arr[i - 1] < insVal) // keep going until the next item is lower
				break;
			i--;
		}
		arr[i] = insVal;    // at this point, all elements after i are shifted
							// i corresponds to proper location to insert value
	}

	private static void print(int[] arr) {
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

}
