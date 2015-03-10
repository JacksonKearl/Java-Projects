package coolSet6;

import java.util.ArrayList;
import java.util.Collections;

public class TestScores {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for ( int i = 0; i < 344; i++ ) {
			list.add(new Integer((int)(Math.random()*21)));
		}
		
		int c = 0;
		for (Integer i : list) {
			System.out.print(i + " ");
			if((++c)%14 ==0) System.out.println();
		}
		
		Collections.sort(list);
		System.out.println();
		
		c = 0;
		for (Integer i : list) {
			System.out.print(i + " ");
			if((++c)%14 ==0) System.out.println();
		}
		
		int[] hist = new int[21];
		for (Integer i : list) {
			hist[i]++;
		}
		
		System.out.println();
		for (int i = 0; i < 21; i++ ) {
			System.out.print(i+ "\t" + hist[i] + "\t");
			for (int  j = 0; j < hist[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int min = 0;
		for (int i : hist) {
			if (list.get(min) > list.get(i)) min = i;
		}
		System.out.println(min);
	}

}
