package coolSet6;

public class Item implements Comparable<Item> {
	public int i;
	public SlickList<Item> partOf;
	
	public Item() {
		i = (int)(Math.random()*90+10);
	}
	
	public static SlickList<Item> makeList(int n) {
		SlickList<Item> ret = new SlickList<Item>();
		for (int i = 0; i < n; i++) {
			Item toAdd = new Item();
			toAdd.partOf = ret;
			ret.add(toAdd);
		}
		return ret;
	}
	
	@Override
	public int compareTo(Item other) {
		partOf.totalComps++;
		return (this.i == other.i) ? 0 : ( this.i > other.i ) ? 1 : -1;
	}
	
	public String toString() {
		return "" + i;
	}
	
}
