package coolSet6;

public class InsertionSort {

	public static void main(String[] args) 
	{
		int[] arr = {8,3,7,1,9,3,2};
		print(arr);
		
		for (int i = 1; i < arr.length; i++) {
			insert(arr, i);
			print(arr);
		}
		
	}
	
	private static void insert(int[] arr, int i) 
	{
		int toInsert = i;
		int insVal = arr[toInsert];
		for (int j = 0; j < i; j++) {
			if (arr[toInsert] < arr[j]) {
				for (int k = toInsert; k > j; k--) {
					arr[k] = arr[k-1];
				}
				arr[j] = insVal;
			}
		}
	}
	private static void print(int[] arr) 
	{
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

}
