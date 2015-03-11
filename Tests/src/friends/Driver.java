package friends;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Friend> myList = new ArrayList<Friend>();
		try {
			FileReader input = new FileReader("src/friends/names.txt");

			String partialString = "";
			while (true) {
				int c = input.read();

				if (c == -1) {
					myList.add(new Friend(partialString));
					break;
				}

				// fuck '\r's on Windows systems.
				if (c == '\r') {
					c = input.read();
				}

				if (c == '\n') {
					myList.add(new Friend(partialString));
					partialString = "";
				} else {
					partialString += (char) c;
				}
			}
			input.close();

			Collections.sort(myList);

			FileWriter output = new FileWriter("src/friends/namesSorted.txt");
			output.write(stringRep(myList));
			output.close();

		} catch (IOException e) {
			System.out.println("Error. Attempting to continue program execution.");
		}

		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("Enter Name (or q to quit): ");
			String toSearch = in.nextLine();
			if (toSearch.equals("q"))
				break;

			System.out.println(find(toSearch, myList));

		}
		in.close();

	}

	private static Friend find(String toSearch, ArrayList<Friend> myList) {
		for (Friend poss : myList) {
			if (("" + poss.fName + " " + poss.lName).equals(toSearch))
				return poss;
		}

		String errorInit = "Error: No friend named:\t" + toSearch + ".";
		try {
			return new Friend(errorInit);
		} catch (IOException e) {
			return null;
		}
	}

	private static String stringRep(ArrayList<Friend> myList) {
		String retVal = "";
		for (Friend person : myList) {
			retVal += person;
			retVal += "\n";
		}
		return retVal;
	}

}
