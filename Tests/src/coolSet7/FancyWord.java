package coolSet7;

public class FancyWord
{
	private char[][] s;
	public FancyWord(String str) {
		s = new char[str.length()][str.length()];
		for (int i = 0; i < s.length; i++) {
			s[0][i] = str.charAt(i);
			s[str.length()-1][i] = str.charAt(i);
		}
		for (int i = 0 ; i < s.length; i++) {
			s[i][i] = s[0][i];
			s[i][s.length - 1 - i] = s[0][s.length - 1 - i];
		}
	}
	
	public String toString() {
		String retVal = "";
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (s[i][j] == 0x0) {
					s[i][j] = ' ';
				}
				retVal += s[i][j];
			}
			retVal += '\n';
		}
		return retVal;
	}
}
