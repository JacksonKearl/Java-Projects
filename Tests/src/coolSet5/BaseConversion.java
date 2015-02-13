package coolSet5;

import java.util.ArrayList;
import java.util.Scanner;
public class BaseConversion
{
	public static Integer convert(int base) {
		System.out.println("Enter Value:");
		Scanner in = new Scanner(System.in);
		in.useDelimiter("/n");
		String val = in.next();
		in.close();
		int v = String.
	}
	
	public static void main(String args [])
	{
		Integer binary = new Integer(0);
		boolean okay = true;
		do
		{
			okay = true;
			System.out.print("Input Number Type(dec/hex/bin): ");
			Scanner in = new Scanner(System.in);
			in.useDelimiter("/n");
			String inputType = in.next();
			in.close();
			switch (inputType) {
			case "dec":
				
				break;
			case "hex":
				
				break;
			case "bin":
				
				break;
			}
		}while(!okay);
	}
}