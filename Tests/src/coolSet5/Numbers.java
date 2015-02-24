package coolSet5;

import java.util.*;

public class Numbers
{
	HashMap<Integer, Boolean>	map	= new HashMap<Integer, Boolean>();
	
	public Numbers(int i)
	{
		int count = 0;
		while (count != i) {
			int nextVal = (int) (Math.random() * 10000);
			if (!map.containsKey(nextVal)) {
				map.put(nextVal, isPerfect(nextVal));
				count++;
			}
		}
	}
	
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				factors.add(i);
			}
		}
		
		return factors;
	}
	
	public String toString()
	{
		int count = 0;
		String retString = "";
		for (Map.Entry<Integer, Boolean> item : map.entrySet()) {
			retString += item.getKey() + "   \t";
			count++;
			if (count % 10 == 0) {
				retString += "\n";
			}
		}
		
		return retString;
		
	}
	
	private Boolean isPerfect(int num)
	{
		ArrayList<Integer> factors = getListOfFactors(num);
		int sum = 0;
		
		for (Integer i : factors) {
			sum += i;
		}
		
		return (num == sum);
	}
	
	public ArrayList<Integer> getPerfectList()
	{
		
		ArrayList<Integer> listOfPerfect = new ArrayList<Integer>();
		
		for (Map.Entry<Integer, Boolean> item : map.entrySet()) {
			if (item.getValue()) {
				listOfPerfect.add(item.getKey());
			}
		}
		
		return listOfPerfect;
	}
	
}
