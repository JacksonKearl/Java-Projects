/**
 * 
 */
package linkedList;

/** Class to drive the linked list. Obviously. 
 * @author Jackson Kearl
 *
 */
public class LinkedListDriver {

	/**All code to drive linked list will be called from this main function.
	 * @param args Unused
	 */
	public static void main(String[] args) {
		MyLinkedList theList = new MyLinkedList();
		
		for (int i = 1; i < 10; i++) {
			theList.add(i);
		}
		
		System.out.println("Initail: " + theList + "\n");
		
		
		theList.addValToBeginning(0);
		System.out.println("Added value: " + theList);
		
		theList.addValAfterVal(34,3);
		System.out.println("Added value: " + theList);
		
		theList.addValAfterVal(10, 9);
		System.out.println("Added value: " + theList);

		
		MyLinkedList reversedList = theList.reverse();
		System.out.println("\nReversed: " + reversedList);
		
		
		theList.removeNodeWithVal(34);
		System.out.println("\nRemoved value 34: " + theList);	
		
		theList.removeNodeWithVal(10);
		System.out.println("Removed value 10: " + theList);
		
		theList.removeNodeWithVal(0);
		System.out.println("Removed value 00: " + theList);
		

	}

}
