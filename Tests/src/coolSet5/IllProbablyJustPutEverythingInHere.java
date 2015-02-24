package coolSet5;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class IllProbablyJustPutEverythingInHere
{
	
	public static void randomHisto()
	{
		int[] arr = new int[10];
		
		System.out.println("Index\tValue\tAmount\t");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 20);
			System.out.print(i + "\t" + arr[i] + "\t");
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> factors = new ArrayList<Integer>();
		System.out.print("[1");
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.print(", " + i);
				factors.add(i);
			}
		}
		System.out.println("]");
		return factors;
	}
	
	public static void listThing()
	{
		try {
			File file = new File("src/coolSet5/Output.txt");
			
			FileWriter out = new FileWriter(file);
			
			Numbers burrito = new Numbers(1500);
			out.write("Array \"bunch\" is:\n" + burrito);
			
			ArrayList<Integer> taco = burrito.getPerfectList();
			out.write("\n\nThe perfect squares are: ");
			for (Integer i : taco) {
				out.write(String.format("%-8d", i));
			}
			
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	public static void iDThing(int amt)
	{
		IDSet set = new IDSet(amt);
		try {
			FileWriter out = new FileWriter(new File("src/coolset5/IDs"));
			out.write(set + "\n");
			out.write(set.sorted());
			out.close();
			
		} catch (Throwable t) {
			t.printStackTrace();
		}
		
	}
	
	public static void primesBelow(int amt)
	{
		boolean[] arr = new boolean[amt];
		for (int i = 0; i < amt; i++) {
			arr[i] = true;
		}
		;
		for (int i = 2; i < amt; i++) {
			if (arr[i]) {
				for (int iter = 2 * i; iter < amt; iter += i) {
					arr[iter] = false;
				}
			}
		}
		String retVal = "";
		int count = 0;
		for (int i = 1; i < amt; i++) {
			if (arr[i]) {
				retVal += i + "   \t";
				count++;
				if (count % 7 == 0) {
					retVal += '\n';
				}
			}
		}
		System.out.println(retVal);
	}
	
	public static void binary(int n)
	{
		System.out.println(Integer.toBinaryString(n));
	}
	
	public static void main(String[] args)
	{
		randomHisto();
		getListOfFactors(9);
		getListOfFactors(23);
		listThing();
		iDThing(20);
		primesBelow(200);
		binary(31);
		
	}
	
}
