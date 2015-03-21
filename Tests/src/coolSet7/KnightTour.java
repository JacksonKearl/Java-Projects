package coolSet7;

public class KnightTour {
	public static final int HEIGHT = 8;
	public static final int WIDTH = 8;

	public static final Board board = new Board(HEIGHT, WIDTH);

	public static void main(String args[]) {
		long start = System.currentTimeMillis();
		findPath(new Point(0,0, board), 1);
		long finish = System.currentTimeMillis();
		System.out.println(board);
		System.out.println("Took " + (finish-start) + " miliseconds");
	}

	private static boolean findPath(Point nextPoint, int num) {
		if (num == HEIGHT * WIDTH) { // base case. last move means all others
			board.set(nextPoint, num); // are in viable positions, success
			return true;
		}

		for (Point next : board.findNeighborsOf(nextPoint)) {
			board.set(nextPoint, num);
			
			if (findPath(next, num + 1)) {
				return true;
			} else {
				board.set(nextPoint, 0);
			}
		}
		return false;
	}
}