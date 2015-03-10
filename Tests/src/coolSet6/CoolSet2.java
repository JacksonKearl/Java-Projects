package coolSet6;

import java.util.*;

public class CoolSet2 {

	public static void main(String[] args) {
		SlickList<Item> list = Item.makeList(30);
		Sorter.print(list);
		ArrayList<Item> unique = Sorter.getUnique(list);
		Sorter.print(unique);
		Collections.sort(unique);
		Sorter.print(unique);
		
	}

}
