package coolSet7;


public class Move {
	public int num;
	public Point p;

	public Move(Point p, int num) {		
		this.num = num;
		this.p = p;
	}
	
	public void addMove() {
		KnightTour.board[p.y][p.x] = num;
	}
	
	public void removeMove() {
		KnightTour.board[p.y][p.x] = num;
	}

}
