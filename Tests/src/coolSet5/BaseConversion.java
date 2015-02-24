package coolSet5;

import java.util.Scanner;

public class BaseConversion
{
	static Scanner	in	= new Scanner(System.in);
	
	public static Integer convert(int base)
	{
		System.out.print("Enter Value: ");
		String val = in.next();
		
		return Integer.parseInt(val, base);
	}
	
	public static void main(String args[])
	{
		while (true) {
			System.out.print("Input Number Type(dec/hex/bin): ");
			
			String inputType = in.next();
			String line = "Invalid Input";
			Integer val;
			switch (inputType) {
				case "dec":
					val = convert(10);
					line = String.format("Binary: %10s \nHexidecimal: %5s",
							Integer.toString(val, 2), Integer.toString(val, 16));
					break;
				case "hex":
					val = convert(16);
					line = String.format("Binary: %10s \nDecimal: %9s",
							Integer.toString(val, 2), Integer.toString(val, 10));
					break;
				case "bin":
					val = convert(2);
					line = String.format("Decimal: %7s \nHexidecimal: %3s",
							Integer.toString(val, 10),
							Integer.toString(val, 16));
					break;
			}
			System.out.println(line);
			
			System.out.print("Again (y/n)? ");
			boolean doAgain = in.next().equals("y");
			if (!doAgain)
				break;
			
		}
		in.close();
	}
}