package coolSet7;

import java.io.File;
import java.util.Scanner;


public class TwoDArrayDriver
{
	public static void main(String[] args) throws Throwable
	{
		Scanner inFile = new Scanner(new File("src/coolset7/matrix.dat"));
		int row = inFile.nextInt();
		int col = inFile.nextInt();
		int[][] matrix = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = Integer.parseInt(inFile.next());
			}
		}
		System.out.println();
		TwoDArray app = new TwoDArray(row, col, matrix);
		System.out.println("Default display...");
		app.display();
		app.fun1();
		System.out.println("Default display...");
		app.display();
		app.fun2();
		System.out.println("Default display...");
		app.display();
		inFile.close();
	}
	

}