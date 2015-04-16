package coolSet7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CoolSet7_1
{
	public static void main(String args[]) throws IOException
	{
		Scanner inFile = new Scanner(new File("src/coolSet7/coolset7-1.dat"));

		while (inFile.hasNextLine()) {
			createThing(inFile.nextLine());
		}
		inFile.close();

	}

	private static void createThing(String str)
	{
		FancyWord word = new FancyWord(str);
		System.out.println(word);
	}

}
