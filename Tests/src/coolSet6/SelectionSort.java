package coolSet6;

public class SelectionSort 
{
	public static void main( String args[] )
	{
		int[] theArray = {9,4,2,6,2,7,8,5};
		print(theArray);
		for (int i = 0; i < theArray.length; i++) {
			int sIndex = getSmallestIndex(theArray, i);
			swap( i, sIndex, theArray);
			print(theArray);
		}
	}
	
	private static int getSmallestIndex(int[] theArray, int start)
	{
		int possibleSmallest = start;
		for (int j = start; j< theArray.length; j++) {
			if (theArray[possibleSmallest] > theArray[j] ) 
				possibleSmallest = j;
		}
		return possibleSmallest;
	}
	
	private static void print(int[] arr) 
	{
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}
	
	private static void swap( int a, int b, int[] arr) 
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
