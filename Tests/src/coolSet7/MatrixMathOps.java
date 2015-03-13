package coolSet7;

public class MatrixMathOps
{

	public static int[][] generateIntMatrix(int yDim, int xDim, int minVal, int maxVal)
	{
		assert(yDim>0 && xDim > 0 && minVal < maxVal);
		int[][] arr = new int[yDim][xDim];
		for (int i = 0; i < yDim; i++) {
			for (int j = 0; j < xDim; j++ ) {
				arr[i][j] = (int)(Math.random()*(maxVal-minVal))+minVal;
			}
		}
		return arr;
	}

	public static void showMatrix(int[][] a)
	{
		for (int i = 0; i < a.length; i++) {
			int[] row = a[i];
			for (int j = 0; j < row.length; j++ ) {
				System.out.print(String.format("%4d", row[j]));
			}
			System.out.println();
		}
		
	}

	public static int[][] scale(int n, int[][] a)
	{
		int[][] retVal = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			int[] row = a[i];
			for (int j = 0; j < row.length; j++) {
				retVal[i][j] = row[j] * n;
			}
				
		}
		return retVal;
	}

	public static int[][] add(int[][] b, int[][] c)
	{
		int[][] retVal = new int[b.length][b[0].length];

		for (int i = 0; i < b.length; i++) {
			int lInner = b[i].length;
			for (int j = 0; j < lInner; j++) {
				retVal[i][j] = b[i][j] + c[i][j];
			}
				
		}
		
		return retVal;
	}

	public static int[][] multiply(int[][] a, int[][] b)
	{
		assert(a[0].length == b[0].length);
		int[][] retVal = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < b.length; k++) {
					retVal[i][j] += (a[i][k] * b[k][j]);
				}
			}
		}
		return retVal;
	}

}
