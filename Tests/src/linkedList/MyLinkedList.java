package linkedList;

public class MyLinkedList 
{

	private Node head;
	private Node last;

	/**
	 * Does nothing. List must be initialized with a value from the add method;
	 */
	public MyLinkedList() { }

	private MyLinkedList(Node n) {
		head = n;
	}

	/**
	 * Adds a new node with value `i` to the tail of the list.
	 * @param i Add node with this value to tail.
	 */
	public void add(int i) 
	{
		Node added = new Node(i);

		if (head == null) {
			head = added;
		} else {
			assert last != null : "There's no end!!";
			last.next = added;
		}

		last = added;
	}

	/**
	 * Adds a node with value `i` directly after the first node with value `j`. 
	 * Assertion is called if no node with value `j` exists in list. 
	 * Runs in O(n), where `n` is the index of the first occurrence of `j`.
	 * 
	 * @param i Value of node to add
	 * @param j Value of node to add after
	 */
	public void addValAfterVal(int i, int j) 
	{
		Node currentNode = head;

		while (currentNode != null) {
			if (currentNode.val == j) {
				Node toAdd = new Node(i);

				toAdd.next = currentNode.next;
				currentNode.next = toAdd;

				return;
			}
			currentNode = currentNode.next;
		}

		assert false : "\n\tThere is no node with that value in the list";
	}

	/** Returns the node in reverse order. 
	 * This is an entirely separate object from the called. 
	 * Copied, so to speak.
	 * @return Reference to a new, reversed list, with contents as objects in called list. 
	 */
	public MyLinkedList reverse() 
	{
		MyLinkedList reversed = new MyLinkedList(head.clone());

		Node toAdd = head.next;

		while (toAdd != null) {
			reversed.newHead(toAdd.clone());
			toAdd = toAdd.next;
		}

		return reversed;
	}

	public void addValToBeginning(int val) {
		newHead(new Node(val));
	}
	
	private void newHead(Node n) {
		n.next = head;
		head = n;
	}
	
	public String toString() 
	{
		Node currentNode= head;
		String toReturn = "{ ";

		while (currentNode.next != null) {
			toReturn += currentNode.val;
			toReturn += ", ";

			currentNode = currentNode.next;
		}
		toReturn += currentNode.val;
		toReturn += " }";

		return toReturn;
	}

	/**
	 * Removes the first node with value `i`. 
	 * If the first node has value `i`, head will be assigned the value of the next node on the list. 
	 * If there is no node with value `i`, an assertion is called.
	 * If the node with value `i` is the only node, returns false, and `head` becomes null
	 * All other cases return true
	 * @param i
	 */
	public boolean removeNodeWithVal(int i) 
	{
		Node currentNode = head;

		if (head.val == i) {
			if (head.next == null) {
				return false;
			} else {
				head = head.next;
				currentNode = null;
				return true;
			}
		}

		while (currentNode.next != null) {
			
			Node previousNode = currentNode;
			currentNode = currentNode.next;
			
			if (currentNode.val == i) {
				previousNode.next = currentNode.next;
				currentNode = null;
				return true;
			}
		}
		
		assert currentNode.next != null : "Node to remove not found";

		return true;
	}

}
