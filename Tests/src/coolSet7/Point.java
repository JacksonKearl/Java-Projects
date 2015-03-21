package coolSet7;

public class Point implements Comparable<Point> {
	int x, y;
	Board board;
	public Point(int x, int y, Board b) {
		this.x = x;
		this.y = y;
		board = b;
		
	}
	
	public Point translate(int [] delta) {
		return new Point(x + delta[0], y + delta[1], board);
	}
	
	@Override
	public int compareTo(Point that) {
		return Integer.compare(this.board.evalViabilityOf(this), this.board.evalViabilityOf(that));
	}

}
