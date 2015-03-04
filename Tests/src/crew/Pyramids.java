package crew;

public class Pyramids {
	static int totalPieces = 0;
	static int totalDistance = 0;
	private static void printPiece(int n) {
		totalPieces++;
		System.out.print(n + "k:" + ((n == 10) ? "" : " "));
		for (int i = 1; i <= n; i++) {
			System.out.print("-");
			totalDistance++;
		}
		System.out.println();
	}
	
	private static void printPyramid(int n, int level) {
		if ( level == 0 ) {
			printPiece(n);
			return;
		}
		for (int i = 1; i<= n; i++)
			printPyramid(i, level-1);
		for (int i = n-1; i > 0; i--)
			printPyramid(i, level-1);
	}
	
	public static void main( String args[] ) {
		printPyramid(10, 5);
		System.out.printf("\n\n\nTotal Pieces:   %d\nTotal Distance: %d\nTime @2:00:     %d hrs", totalPieces, totalDistance, totalDistance*4/60);
		
	}
		
}
