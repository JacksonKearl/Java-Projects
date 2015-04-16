package coolSet7;

public class FancyWord
{
	private final char[][]	s;

	public FancyWord(final String str)
	{
		s = new char[str.length()][str.length()];

		for (int i = 0; i < s.length; i++) {
			s[0][i] = str.charAt(i); // fill first row
			s[str.length() - 1][i] = str.charAt(i); // fill last row
			s[i][i] = str.charAt(i); // fill downright diagonal
			s[s.length - 1 - i][i] = str.charAt(i); // fill upright diag
		}
	}

	@Override
	public String toString()
	{
		String retVal = "";
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (s[i][j] == 0x0) {
					System.out.println();
					s[i][j] = ' ';
				}
				retVal += s[i][j];
			}
			retVal += '\n';
		}
		return retVal;
	}
}
