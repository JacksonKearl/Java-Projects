package coolSet7;

public class Point implements Comparable<Point>
{
	final int		x, y;
	final Board	board;

	/**
	 * Creates new immutable point on specified board.
	 */
	public Point(final int x, final int y, final Board b)
	{
		this.x = x;
		this.y = y;
		board = b;

	}

	/**
	 * Returns a copy of the point translated by the <code>delta[]</code>
	 * coordinates.
	 *
	 * @param delta
	 *          coordinates to translate by. In format x = <code>delta[0]</code> y
	 *          = <code>delta[1]</code>
	 * @return new point moved by delta, original point is unchanged
	 */
	public Point translate(final int[] delta)
	{
		return new Point(x + delta[0], y + delta[1], board);
	}

	@Override
	public int compareTo(final Point that)
	{
		return Integer.compare(this.board.evalViabilityOf(this),
				this.board.evalViabilityOf(that));
	}

}
