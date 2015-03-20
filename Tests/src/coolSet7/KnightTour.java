package coolSet7;

import java.util.LinkedList;



public class KnightTour
{
	private static int board[][] = new int[8][8];
	private static LinkedList<Point> path;
	public static void main( String args[] ) {
		findPath();
		displayPath();
	}

	private static void displayPath()
	{
		for (int i = 0; i < 64; i++) {
			System.out.printf("%4d",board[i/8][i%8]);
			if ((i+1)%8 == 0) 
				System.out.println();
		}
		
	}

	private static void findPath()
	{
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				path = rFindPath(new Point(i, j, board, 0));
				if (path != null) return;
			}
		}
	}
	
	private static LinkedList<Point> rFindPath(Point p)
	{
		if (p.num == 63) {
			LinkedList<Point> head =  new LinkedList<Point>();
			head.add(p);
			return head;
		}
		for (Point next : p.findNextMoves()) {
			LinkedList<Point> tail = rFindPath(next);
			if (tail != null) {
				tail.add(p);
				return tail;
			} else {
				board[next.x][next.y] = 0;
			}
		}
		return null;
	}
}
