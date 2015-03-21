package coolSet7;

import java.util.LinkedList;

public class KnightTour
{
	public static final int HEIGHT = 8;
	public static final int WIDTH  = 8;
	
	public static int board[][] = new int[HEIGHT][WIDTH];
	private static LinkedList<Move> path;
	
	public static void main( String args[] ) {
		findPath();
		displayPath();
	}

	public static void displayPath()
	{
		for (int i = 0; i < (WIDTH*HEIGHT); i++) {
			System.out.printf("%-3d",board[i/HEIGHT][i%WIDTH]);
			if ((i+1)%WIDTH == 0) 
				System.out.println();
		}
		
	}

	private static void findPath()
	{
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				path = rFindPath(new Point(i, j), 1);
				if (path != null) return;
			}
		}
	}
	
	private static LinkedList<Move> rFindPath(Point nextPoint, int num)
	{
		if (num == HEIGHT*WIDTH) {
			LinkedList<Move> head = new LinkedList<Move>();
			Move finalMove = new Move(nextPoint, num);
			finalMove.addMove();
			head.add(finalMove);
			return head;
		}
		
		for (Point next : nextPoint.nextPoints()) {
			Move move = new Move(nextPoint, num);
			move.addMove();
			LinkedList<Move> tail = rFindPath(next, num + 1);
			if (tail != null) {
				tail.add(move);
				move.addMove();
				return tail;
			} else {
				move.removeMove();
			}
		}
		return null;
	}
}