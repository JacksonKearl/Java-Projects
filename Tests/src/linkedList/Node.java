package linkedList;

/**
 * Basically a struct.
 * Contains an int `val` and a Node `next`.
 * @author Jackson Kearl
 *
 */
public class Node {
	public int val;
	public Node next = null;
	
	public Node(int v) {
		val = v;
	}
	
	public Node clone() {
		return new Node(val);
	}
}
