package coolSet7;

public class KnightTour
{
	public static final boolean	VERBOSE	= false;
	public static final int			HEIGHT	= 8;
	public static final int			WIDTH		= 8;

	public static final Board		board		= new Board(HEIGHT, WIDTH);

	public static void main(final String args[])
	{
		final long start = System.currentTimeMillis();
		findPath(new Point(0, 0, board), 1);
		final long finish = System.currentTimeMillis();
		System.out.println(board);
		System.out.println("Took " + (finish - start) + " miliseconds");
	}

	/**
	 *
	 * @param nextPoint
	 *          The location of the next point in the possible path
	 * @param num
	 *          The position in path of this next point
	 * @return true if a viable path node, false otherwise
	 */
	private static boolean findPath(final Point nextPoint, final int num)
	{
		if (num == HEIGHT * WIDTH) { // base case. last move means all others
			board.set(nextPoint, num); // are in viable positions, success
			return true;
		}

		for (final Point next : board.findNeighborsOf(nextPoint)) {
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