package perm;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Permutations {

	public static String permutate(char[] text) 
	{
		ArrayList<Character> charList = new ArrayList<Character> ();
		
		for (int i = 0; i < text.length; i++) {
			charList.add(text[i]);
		}

		return permutate("", charList);
	}

	public static String permutate(String existing, ArrayList<Character> rest) 
	{
		String retVal = "";

		if (rest.size() == 0) {
			retVal += existing + "\n";
		} else {
			for (int i = 0; i < rest.size(); i++) {
				char removed = rest.remove(i);
				retVal += permutate(existing + removed, rest);
				rest.add(i, removed);
			}
		}

		return retVal;
	}

	public static void main(String[] args) 
	{
		try {
			File file = new File("src/perm/Output.txt");

			FileWriter out = new FileWriter(file);

			Scanner userIn = new Scanner(System.in);
			userIn.useDelimiter("\n");

			System.out.print("Enter text to permutate: ");
			char[] text = userIn.next().toCharArray();
			userIn.close();			

			String allPerms = permutate(text);
			String valList= splitAndUnique(allPerms);
			
			out.write(valList);

			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	private static String splitAndUnique(String allPerms) 
	{
		ArrayList<String> allLines = new ArrayList<String>();
		String finalString = "";
		
		int delimIndex = allPerms.indexOf("\n");
		int beginIndex = 0;
		
		while (delimIndex != -1) {
			String line = allPerms.substring(beginIndex, delimIndex);
			beginIndex = delimIndex+1;
			delimIndex = allPerms.indexOf('\n', beginIndex);
			if (!allLines.contains(line)) {
				allLines.add(line);
				finalString += line + "\n";
			}
		}
		
		return finalString;
	}
}