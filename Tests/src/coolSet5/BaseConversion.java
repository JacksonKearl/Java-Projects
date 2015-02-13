package coolSet5;

import java.util.Scanner;

public class BaseConversion
{
	static Scanner	in	= new Scanner(System.in);
	
	public static void convert(int base)
	{
		System.out.print("Enter Value: ");
		String val = in.next();
		Integer decVal = Integer.parseInt(val, base);
		
		System.out.println("Binary: " + Integer.toBinaryString(decVal));
		System.out.println("Decimal: " + Integer.toString(decVal));
		System.out.println("Hexidecimal: " + Integer.toHexString(decVal));
	}
	
	public static void main(String args[])
	{
		System.out.print("Input Number Type(dec/hex/bin): ");
		in.useDelimiter("\n");
		String inputType = in.next();
		switch (inputType) {
			case "dec":
				convert(10);
				break;
			case "hex":
				convert(16);
				break;
			case "bin":
				convert(2);
				break;
		}
	}
}