package coolSet7;



public class KnightTour
{
	private static int board[][] = new int[8][8];
	
	public static void main( String args[] ) {
		while (!testPath())
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
	
	private static int[] findBestNext(int x, int y) {
		int[][] allNext = findNextMoves(x,y);
		int [] best = findBestMove(allNext);
		return best;
	}
	
	private static int[][] findNextMoves(int x, int y) {
		int[][] ret = new int[8][2];
		int[][] delta = {	{1,2},{-1,2},
							{2,1},{2,-1},
							{1,-2},{-1,-2},
							{-2,1},{-2,-1}};
		
		for (int i = 0; i < 8; i++) {
			if ( (x + delta[i][0] < 0) || (x + delta[i][0] > 7) ||
				 (y + delta[i][1] < 0) || (y + delta[i][1] > 7) ||
				 (board[x+ delta[i][0]][y + delta[i][1]] != 0)) {
				ret[i] = null;
			} else {	
				ret[i][0] = x + delta[i][0];
				ret[i][1] =	y + delta[i][1];
			}
		}
		return ret;	
	}
	
	private static int[] findBestMove(int[][] possible) {
		int bestPossible = 0;
		for (int i = 0; i < possible.length; i++ ) {
			if (getGoodness(possible[bestPossible]) < getGoodness(possible[i])) {
				bestPossible = i;
			}
		}
		return possible[bestPossible];
	}
	
	private static int getGoodness(int[] move) {
		int possible = 0;
		int[][] nextMoves = findNextMoves(move[0], move[1]);
		for (int i = 0; i < nextMoves.length; i++) {
			int[] secondMove = nextMoves[i];
			if (secondMove != null) {
				possible++;
			}
		}
		return possible;
	}

	private static void findPath()
	{
		// TODO Auto-generated method stub
		
	}

	private static boolean testPath()
	{
		for (int i = 0; i < 64; i++) {
			if (board[i/8][i%8] == 0)
				return false;
		}
		return true;
	}
}
