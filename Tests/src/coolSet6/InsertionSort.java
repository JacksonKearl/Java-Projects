package coolSet6;

public class InsertionSort {

	public static void main(String[] args) 
	{
		int[] arr = {8,3,7,1,9,3,2};
		print(arr);
		
		for (int i = 1; i < arr.length; i++) {
			sortInsert(arr, i);
			print(arr);
		}
		
	}
	
	private static void sortInsert(int[] arr, int i) 
	{
		int toInsert = i;
		int insVal = arr[toInsert];
		int j = i;
		while (j != 0 && arr[toInsert] <= arr[j]) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j] = insVal;
	}
	private static void print(int[] arr) 
	{
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

}
