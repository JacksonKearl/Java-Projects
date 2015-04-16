package coolSet7;

public class TwoDArray
{
	private final int[][]	arr;

	public TwoDArray(final int row, final int col, final int[][] matrix)
	{
		arr = matrix.clone();
		System.out.println("Creating matrix...");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(String.format("grid[%d][%d] = %d ", i, j, arr[i][j]));
			}
			System.out.println();
		}
	}

	public void display()
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

	public void fun1()
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] % 2 == 0) {
					arr[i][j] = 0;
				}
			}
		}
		System.out.println("Changing evens to 0's...");
		display();

	}

	public void fun2()
	{
		System.out.println("Diagonal neighbors that are 0....");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				final int near[][] = { { -1, -1 }, { 1, -1 }, { 1, 1 }, { -1, 1 } };
				int num = 0;
				for (int k = 0; k < near.length; k++) {
					try {
						num += (arr[i + near[k][0]][j + near[k][1]] == 0) ? 1 : 0;
					} catch (final Throwable t) {
					}
				}
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

}
