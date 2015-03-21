package coolSet7;

import java.util.LinkedList;

public class KnightTour
{
	public static final int HEIGHT = 8;
	public static final int WIDTH  = 8;
	
	public static final Board board = new Board(HEIGHT, WIDTH);
	
	private static LinkedList<Point> path;
	
	public static void main( String args[] ) {
		findPath();
		System.out.println(board);
	}

	private static void findPath()
	{
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				path = rFindPath(new Point(i, j, board), 1);
				if (path != null) return;
			}
		}
	}
	
	private static LinkedList<Point> rFindPath(Point nextPoint, int num)
	{
		if (num == HEIGHT*WIDTH) {
			LinkedList<Point> head = new LinkedList<Point>();			
			board.set(nextPoint, num);

			head.add(nextPoint);
			return head;
		}
		
		for (Point next : board.findNeighborsOf(nextPoint)) {
			board.set(nextPoint, num);
			LinkedList<Point> tail = rFindPath(next, num + 1);
			if (tail != null) {
				tail.add(nextPoint);
				return tail;
			} else {
				board.set(nextPoint, 0);
			}
		}
		return null;
	}
}