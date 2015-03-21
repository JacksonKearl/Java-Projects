package coolSet7;

import java.util.Collections;
import java.util.LinkedList;


public class Board {

	private int[][] board;
	private int width, height;
	
	public Board(int height, int width) {
		board = new int[height][width];
		this.width = width;
		this.height = height;
	}
	
	public int get(int x, int y) {
		return board[y][x];
	}
	public int get(Point p) {
		return board[p.y][p.x];
	}
	public void set(Point p, int val) {
		board[p.y][p.x] = val;
	}
	
	public String toString()
	{
		StringBuilder strBuild = new StringBuilder();
		for (int i = 0; i < (width*height); i++) {
			strBuild.append(String.format("%-3d",get(i%width, i/width)));
			if ((i+1)%width == 0) 
				strBuild.append('\n');
		}
		return strBuild.toString();
		
	}
	
	/**
	 * @return How many points on this board can be visited directly from given point. 
	 */
	public int evalViabilityOf(Point p) {
		int viable = 0;
		
		// set of possible moves for knight in terms of changes in x ([0]) and
		// y([1]) coords.
		int[][] delta = { { 1, 2 }, { -1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 },
				{ -1, -2 }, { -2, 1 }, { -2, -1 } };

		for (int i = 0; i < 8; i++) {
			
			try {
				if (get(p.translate(delta[i])) == 0) {
					viable++;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				//this is okay, but don't do anything. 
			}
		}
		return viable;
	}
	
	/**
	 * DO NOT use this methods to determine size of array for comparator use. 
	 * Doing so will cause a Stack Overflow Error. Use viability() instead.
	 * 
	 * @return List of all points that could be moved to after this point,
	 *         ordered by how many other points can be moved to by them.
	 */
	public LinkedList<Point> findNeighborsOf(Point p) {

		LinkedList<Point> nextPoints = new LinkedList<Point>();

		// set of possible moves for knight in terms of changes in x ([0]) and
		// y([1]) coords.
		int[][] delta = { { 1, 2 }, { -1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 },
				{ -1, -2 }, { -2, 1 }, { -2, -1 } };

		for (int i = 0; i < 8; i++) {
			Point possiblePoint = p.translate(delta[i]);
			try {
				if (get(possiblePoint) == 0) {
					nextPoints.add(possiblePoint);
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				//this is okay, but don't do anything. 
			}
		}
		Collections.sort(nextPoints);
		return nextPoints;
	}
	
	

}
