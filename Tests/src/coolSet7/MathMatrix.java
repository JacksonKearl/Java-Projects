package coolSet7;

public class MathMatrix
{
	public static void main(String args[])
	{
		int[][] A = MatrixMathOps.generateIntMatrix(2, 4, -5, 5);
		int[][] B = MatrixMathOps.generateIntMatrix(4, 3, -5, 5);
		int[][] C = MatrixMathOps.generateIntMatrix(4, 3, -5, 5);
		System.out.println("A:");
		MatrixMathOps.showMatrix(A);
		System.out.println("\nB:");
		MatrixMathOps.showMatrix(B);
		System.out.println("\nC:");
		MatrixMathOps.showMatrix(C);
		int n = 2;
		// int[][] D = MatrixMathOps.scale(n,A);
		System.out.println("\n**********************************\n" + n
				+ "*A is ");
		MatrixMathOps.showMatrix(MatrixMathOps.scale(n, A));
		// int[][] E = MatrixMathOps.add(B,C);
		System.out
				.println("\n**********************************\n" + "B + C is ");
		MatrixMathOps.showMatrix(MatrixMathOps.add(B, C));
		// int[][] F = MatrixMathOps.multiply(A,B);
		System.out
				.println("\n**********************************\n" + "A * B is ");
		MatrixMathOps.showMatrix(MatrixMathOps.multiply(A, B));
	}
}