package obfusTech;

import java.util.function.*;

public class Obf {
	public static int m;
	public static void main(String[] args) {
		m = a(a((a) -> (a*a))-a((a) -> (a*a)));
		System.out.println(a((a) -> (m()/(a))));
		System.out.println(a((a) -> (m()/(a*a*a))));

	}

	/**
	 * returns a return value based off of what is passed into it
	 * @param a a floating point value
	 * @param b a floating point value
	 * @param c an UnaryOperator
	 * @return a floating point value
	 */
	public static float a(float a, float b, UnaryOperator<Float> c) { try {return (a - (a += ( (c.apply(b)))) == m) ? a : a(a, b + m(), c); } catch (Throwable m) { return a;} }
	/**
	 * returns a return value based off of what is passed into it
	 * @param a a floating point value
	 * @param b an UnaryOperator
	 * @return a floating point value
	 */
	public static float a(float a, UnaryOperator<Float> b) { return (a - (a += ((b.apply((float)m())))) == m) ? a : a(a, m() + m(), b); }
	/**
	 * returns a return value based off of what is passed into it
	 * @param b an UnaryOperator
	 * @return a floating point value
	 */
	public static float a(UnaryOperator<Float> b) { return (m - ( (b.apply((float)m))) == m) ? m : a(m, b); }

	/**
	 * Evaluates and returns the expression returned by evaluating the return value returned by typcasting the value passed into the funchion to the new type of int
	 * @param a to number to be evaluated and later altered such that it is returned in a similar state to how I left it
	 * @return a number almost, but not quite entirely, unlike a
	 */
	public static int a(float a) { return (int)a; }
	
	/**
	 * Evaluates and returns the expression returned by evaluating the return value returned by incrementing the value by the given value
	 * In best coding style, I have neglected the use of hardcoded integer values in favor of unicoide value equivalents, thus creating
	 * a "magic number" free program, for easy future updates
	 * @param a to number to be evaluated and later altered such that it is returned in a similar state to how I left it
	 * @return a number almost, but not quite entirely, unlike a
	 */
	public static int m() { return m+  ('f' - 'g' ) ; }
	
	
}
