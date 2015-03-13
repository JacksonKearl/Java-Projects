package coolSet7;

import java.io.FileReader;
import java.io.IOException;

public class CoolSet7_1
{
	public static void main(String args[]) throws IOException
	{
		FileReader inFile = new FileReader("src/coolSet7/coolset7-1.dat");
		
		String str = "";
		int c = inFile.read();
		while (c != -1) {
			if (c == '\r') { //Do noting. Windows systems. 
			} else if (c == '\n') {
				createThing(str);
				str = "";
			} else {
				str += (char)c;
			}
			c = inFile.read();
		}
		inFile.close();
		
	}

	private static void createThing(String str)
	{
		FancyWord word = new FancyWord(str);
		System.out.println(word);
	}
	
	
}
