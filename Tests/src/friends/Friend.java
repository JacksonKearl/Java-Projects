package friends;

import java.io.IOException;

public class Friend implements Comparable<Friend>
{
	String fName = "";
	String lName = "";
	String pNumb = "";

	/**
	 * Creates new Friend from data in a string single line format.
	 * 
	 * @param str
	 *            Line containing data in format first [space] last [tab] num
	 */
	public Friend(String str) throws IOException
	{
		int spacePos = str.indexOf(" ");
		int tabPos = str.indexOf("\t");

		if (spacePos == -1 || tabPos == -1) {
			throw new IOException();
		}
		fName = str.substring(0, spacePos);
		lName = str.substring(spacePos + 1, tabPos);
		pNumb = str.substring(tabPos + 1);
	}

	public String toString()
	{
		return fName + " " + lName + "\t" + pNumb;
	}

	@Override
	public int compareTo(Friend o)
	{
		return (lName.compareTo(o.lName) == 0) ? (fName.compareTo(o.fName))
				: (lName.compareTo(o.lName));
	}

}
