package coolSet5;

import java.util.*;

public class IDSet {
	
	HashMap<Integer, Student> map = new HashMap<Integer, Student>(); 
	int _amt;
	public IDSet(int amt) {
		_amt = amt;
		int count = 0;
		while (count < amt) {
			int rand = (int)(Math.random()*100000);
			if (!map.containsKey(rand)) {
				map.put(rand, new Student(rand));
				count++;
			}
		}
	}
	
	public String toString() {
		String retVal = "";
		for (Student stu : map.values()) {
			retVal += stu;
		}
		return retVal;
	}
	
	public String sorted() {
		ArrayList<Student> arrStu = new ArrayList<Student>();
		
		for (Student stu : map.values()) {
			arrStu.add(stu);
		}
		
		Collections.sort(arrStu);
		String retVal = "";
		
		for (Student stu : arrStu) {
			retVal += stu;
		}
		
		return retVal;
		
	}

}
