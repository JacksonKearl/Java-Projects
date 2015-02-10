package coolSet5;

import java.util.*;

public class Numbers {
	ArrayList<Integer> list = new ArrayList<Integer>();
	public Numbers(int i) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		int count = 0;
		while (count != i) {
			int nextVal = (int)(Math.random()*10000);
			if (!map.containsKey(nextVal)) {
				map.put(nextVal, true);
				list.add(nextVal);
				count++;
			}
		}
	}

	public void showArray() {
		int count = 0;
		for (Integer i : list) {
			System.out.print(i + "\t");
			count++;
			if (count % 10 == 0) {
				System.out.println();
			}
		}
		
	}

	public void findPerfect() {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Integer> getPerfectList() {
		// TODO Auto-generated method stub
		return null;
	}

}
