package coolSet7;

import java.util.Collections;
import java.util.LinkedList;

public class Point implements Comparable<Point> {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * DO NOT use this methods to determine size of array for comparator use. 
	 * Doing so will cause a Stack Overflow Error. Use viability() instead.
	 * 
	 * @return List of all points that could be moved to after this point,
	 *         ordered by how many other points can be moved to by them.
	 */
	public LinkedList<Point> nextPoints() {

		LinkedList<Point> nextPoints = new LinkedList<Point>();

		// set of possible moves for knight in terms of changes in x ([0]) and
		// y([1]) coords.
		int[][] delta = { { 1, 2 }, { -1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 },
				{ -1, -2 }, { -2, 1 }, { -2, -1 } };

		for (int i = 0; i < 8; i++) {

			// if point is in bounds and unoccupied...
			if (!(     (x + delta[i][0] < 0) 
					|| (x + delta[i][0] > KnightTour.WIDTH - 1)
					|| (y + delta[i][1] < 0) 
					|| (y + delta[i][1] > KnightTour.HEIGHT- 1) 
					|| (KnightTour.board[y+ delta[i][1]][x + delta[i][0]] != 0)
					)) {
				nextPoints.add(new Point(x + delta[i][0], y + delta[i][1]));
			}
		}
		Collections.sort(nextPoints);
		return nextPoints;
	}

	/**
	 * 
	 * @return How many points can be visited directly from this point. 
	 */
	public int viability() {
		int viable = 0;
		
		// set of possible moves for knight in terms of changes in x ([0]) and
		// y([1]) coords.
		int[][] delta = { { 1, 2 }, { -1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 },
				{ -1, -2 }, { -2, 1 }, { -2, -1 } };

		for (int i = 0; i < 8; i++) {
			
			// if point is in bounds and unoccupied...
			if (!(     (x + delta[i][0] < 0)
					|| (x + delta[i][0] > KnightTour.WIDTH - 1)
					|| (y + delta[i][1] < 0)
					|| (y + delta[i][1] > KnightTour.HEIGHT- 1)
					|| (KnightTour.board[y + delta[i][1]][x + delta[i][0]] != 0)
					)) {
				viable++;
			}
		}
		return viable;
	}

	@Override
	public int compareTo(Point o) {
		return Integer.compare(this.viability(), o.viability());
	}

	public String toString() {
		return x + " " + y + "\n";
	}

}
