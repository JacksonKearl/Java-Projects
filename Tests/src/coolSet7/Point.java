package coolSet7;

import java.util.Collections;
import java.util.LinkedList;

public class Point implements Comparable<Point>
{
	public int x, y;
	int[][] board;
	public int num;
	public int goodness;
	public Point(int x, int y, int[][] board, int num)
	{
		this.num = num;
		this.x = x;
		this.y = y;
		this.board = board;
		board[x][y] = num;
		goodness = getGoodness();
	}
	
	private int getGoodness() {	
		LinkedList<Point> ret = new LinkedList<Point>();
		int[][] delta = {	{1,2},{-1,2},
							{2,1},{2,-1},
							{1,-2},{-1,-2},
							{-2,1},{-2,-1}};
		
		for (int i = 0; i < 8; i++) {
			if ( (x + delta[i][0] < 0) || (x + delta[i][0] > 7) ||
				 (y + delta[i][1] < 0) || (y + delta[i][1] > 7) ||
				 (board[x+ delta[i][0]][y + delta[i][1]] != 0)) {
				//Do Nothing
			} else {
				ret.add(new Point(x + delta[i][0], y + delta[i][1], board, num + 1));
			}
		}
		return ret.size();
	}
	
	/**
	 * returns an ArrayList containing all possible next 'Point's to go to, ordered by 
	 * how many 'Point's each of them can go to. 
	 * @return
	 */
	public LinkedList<Point> findNextMoves() {
		LinkedList<Point> ret = new LinkedList<Point>();
		int[][] delta = {	{1,2},{-1,2},
							{2,1},{2,-1},
							{1,-2},{-1,-2},
							{-2,1},{-2,-1}};
		
		for (int i = 0; i < 8; i++) {
			if ( (x + delta[i][0] < 0) || (x + delta[i][0] > 7) ||
				 (y + delta[i][1] < 0) || (y + delta[i][1] > 7) ||
				 (board[x+ delta[i][0]][y + delta[i][1]] != 0)) {
				//Do Nothing
			} else {
				ret.add(new Point(x + delta[i][0], y + delta[i][1], board, num + 1));
			}
		}
		Collections.sort(ret);
		if (ret.size() == 0) return null;
		return ret;	
	}

	@Override
	public int compareTo(Point arg0)
	{
		if (this.goodness == arg0.goodness) 
			return 0;
		return (this.goodness < arg0.goodness) ? -1 : 1;
	}
}
