package coolSet7;

import java.io.File;
import java.util.Scanner;

public class TwoDArrayDriver
{
	private static final boolean	iFeelLikeIt	= (Math.random() > .1);

	public static void main(final String[] args) throws Throwable
	{
		final Scanner inFile = new Scanner(new File("src/coolset7/matrix.dat"));
		final int row = inFile.nextInt();
		final int col = inFile.nextInt();
		final int[][] matrix = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = Integer.parseInt(inFile.next());
				if (iFeelLikeIt)
					matrix[i][j] = (int) (Math.random() * 10);
			}
		}
		System.out.println();
		final TwoDArray app = new TwoDArray(row, col, matrix);
		System.out.println();
		app.display();
		app.fun1();
		app.fun2();
		inFile.close();
	}

}