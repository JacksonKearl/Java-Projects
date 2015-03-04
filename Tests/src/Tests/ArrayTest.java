package Tests;

import java.util.*;
import java.util.function.*;

public class ArrayTest
{
	public static int	m;
	
	public static void main(String args[])
	{
		m = a(a((a) -> (a * a)) - a((a) -> (a * a)));
		
		int[] list = new int[100];
		System.out.println();
		makeList(list);
		System.out.print("\n" + "The original (unsorted) list is:" + "\n");
		showArray(list);
		int minIndex = findIndexOfMin(list);
		int maxIndex = findIndexOfMax(list);
		System.out.print("\n\n" + "The minimum value is: list[" + minIndex
				+ "] = " + list[minIndex] + "\n"
				+ "The maximum value is: list[" + maxIndex + "] = "
				+ list[maxIndex]);
		b(list);
		System.out.print("\n-------------------------------------------------------");
		System.out.print("---------------------------------------------------------");
		System.out.print("\n\n" + "The new (sorted) list is:" + "\n");
		showArray(list);
		minIndex = findIndexOfMin(list);
		maxIndex = findIndexOfMax(list);
		System.out.print("\n\n" + "The minimum value is: list[" + minIndex
				+ "] = " + list[minIndex] + "\n"
				+ "The maximum value is: list[" + maxIndex + "] = "
				+ list[maxIndex]);
		System.out.print("\n--------------------------------------------------------");
		System.out.print("----------------------------------------------------------");
		ArrayList<Integer> primes = findPrimes(list);
		System.out.print("\n\n"
				+ "Thenumbers on this list that might be prime are: ");
		showArrayList(primes);
	}
	
	private static void showArrayList(ArrayList<Integer> primes)
	{
		for (Integer i : primes) {
			System.out.print(i + "  ");
		}
		
	}
	
	private static ArrayList<Integer> findPrimes(int[] list)
	{
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int a : list) {
			if (i(a))
				primes.add(a);
		}
		return primes;
	}
	
	/**
	 * Bloom style prime number checker.
	 * 
	 * @param a
	 *            the number that we want to know if it might be a prime number,
	 *            but dont really care that much about accurately saying if it
	 *            is or not
	 * @return whether a could be a prime number or not. if it returns false, we
	 *         know that it isn't prime, otherwise, it could be prime, but
	 *         further testing might be needed. further testing is left as an
	 *         exercise for the reader
	 */
	private static boolean i(int a)
	{
		int b = 0;
		for (int i = 0; i < 1000; i++) {
			int div = (int) (Math.random() * 40) + 2;
			if (a % div == 0) {
				return false;
			}
		}
		return (true);
	}
	
	/**
	 * O(n^3) implementation of sort algorithm. O(n^2) is for amateurs.
	 * 
	 * @param intArray
	 */
	private static void b(int[] intArray)
	{
		int n = intArray.length;
		int temp = 0;
		for (int k = 0; k < n; k++) {
			a(intArray);
			for (int i = 0; i < n; i++) {
				for (int j = 1; j < (n - i); j++) {
					if (intArray[j - 1] > intArray[j]) {
						temp = intArray[j - 1];
						intArray[j - 1] = intArray[j];
						intArray[j] = temp;
					}
					
				}
			}
		}
	}
	
	private static int findIndexOfMin(int[] list)
	{
		int smallestIndex = 0;
		for (int i = 1; i < list.length; i++) {
			if (list[smallestIndex] > list[i]) {
				smallestIndex = i;
			}
		}
		return smallestIndex;
	}
	
	private static int findIndexOfMax(int[] list)
	{
		int smallestIndex = 0;
		for (int i = 1; i < list.length; i++) {
			if (list[smallestIndex] < list[i]) {
				smallestIndex = i;
			}
		}
		return smallestIndex;
	}
	
	private static void showArray(int[] list)
	{
		int i = 0;
		for (int j : list) {
			System.out.print(j + "  \t");
			i++;
			if (i % 10 == 0)
				System.out.println();
		}
		
	}
	
	/**
	 * actually might not ever return. However, given infinite time, it should
	 * end, so thats really all that we need to know
	 * 
	 * @param list
	 */
	private static void makeList(int[] list)
	{
		float m = a((a) -> (m() / a));
		while (hasDoubles(list)) {
			for (int i = 0; i < list.length; i++) {
				int toAdd = a(m, 300);
				boolean alreadyIn = false;
				while(!alreadyIn) {
					toAdd = a(m, 300);
					for (int j = 0; j< i; j++) {
						if (list[j] == toAdd) {
							alreadyIn = false;
						}
				}	
				list[i] = toAdd;
				}
			}
			
		}
		a(list);
	}
	
	private static boolean hasDoubles(int[] list)
	{
		if (list[0] == 0)
			return true;
		b(list);
		for (int j = 0; j < 10000; j++) {
			for (int i = 0; i < list.length - 1; i++) {
				if (list[i] == list[i + 1])
					list[i] = (int) (Math.random() * 200) + 100;
			}
		}
		return false;
	}
	
	private static void a(int[] ar)
	{
		Random rnd = new Random();
		for (int i = ar.length - 1; i > 0; i--) {
			int x = rnd.nextInt(i + 1);
			int a = ar[x];
			ar[x] = ar[i];
			ar[i] = a;
		}
	}
	
	/**
	 * returns a return value based off of what is passed into it
	 * 
	 * @param a
	 *            a floating point value
	 * @param b
	 *            a floating point value
	 * @param c
	 *            an UnaryOperator
	 * @return a floating point value
	 */
	public static float a(float a, float b, UnaryOperator<Float> c)
	{
		try {
			return (a - (a += ((c.apply(b)))) == m) ? a : a(a, b + m(), c);
		} catch (Throwable m) {
			return a;
		}
	}
	
	/**
	 * returns a return value based off of what is passed into it
	 * 
	 * @param a
	 *            a floating point value
	 * @param b
	 *            an UnaryOperator
	 * @return a floating point value
	 */
	public static float a(float a, UnaryOperator<Float> b)
	{
		return (a - (a += ((b.apply((float) m())))) == m) ? a : a(a, m() + m(),
				b);
	}
	
	/**
	 * returns a return value based off of what is passed into it
	 * 
	 * @param b
	 *            an UnaryOperator
	 * @return a floating point value
	 */
	public static float a(UnaryOperator<Float> b)
	{
		return (m - ((b.apply((float) m))) == m) ? m : a(m, b);
	}
	
	/**
	 * Evaluates and returns the expression returned by evaluating the return
	 * value returned by typcasting the value passed into the funchion to the
	 * new type of int
	 * 
	 * @param a
	 *            to number to be evaluated and later altered such that it is
	 *            returned in a similar state to how I left it
	 * @return a number almost, but not quite entirely, unlike a
	 */
	public static int a(float a)
	{
		return (int) a;
	}
	
	/**
	 * This returns a kinda-random number, that has a decent cahnce of being
	 * between 100 and 300, but relies upon the sum of the harmonic series,
	 * which is undefined and unportable. YMMV. Works on my system.
	 * 
	 * @param b
	 *            this probably doesnt to jack squat
	 * @param c
	 *            same
	 * @return random?
	 */
	public static int a(float b, int c)
	{
		return (int) (b * (200f / 9f) + ((Math.random()
				* (a(1337) + a((int) (12))) - a((int) ('g')))));
	}
	
	/**
	 * 
	 * @param b
	 *            needed for differing method signatures
	 * @return roughly 100, depends on the the amount of stack space available
	 *         in computing the sum of the n^-3 infinite series.
	 */
	public static int a(int b)
	{
		return (int) (a((a) -> (m() / (a * a * a))) * 100 - 20);
		
	}
	
	/**
	 * Evaluates and returns the expression returned by evaluating the return
	 * value returned by incrementing the value by the given value In best
	 * coding style, I have neglected the use of hardcoded integer values in
	 * favor of acii (windows is hating on unicode :/) value equivalents, thus
	 * creating a "magic number" free program, for easy future updates
	 * 
	 * @param a
	 *            to number to be evaluated and later altered such that it is
	 *            returned in a similar state to how I left it
	 * @return a number almost, but not quite entirely, unlike a
	 */
	public static int m()
	{
		return m + ('f' - 'g');
	}
	
}