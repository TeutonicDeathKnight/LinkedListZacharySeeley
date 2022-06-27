package net.yorksolutions.datastructures;

// A linked list is a data structure
//     A data structure is a thing that stores stuff in a useful way
//     A linked list has a low cost to insert - is quick
//     There is no limit to its size
//     Also has a low cost to remove the first element/piece of data
//     Generally has a low cost to remove the last element/piece of data
//     However, a linked list has a high cost to search
//     Though, there is a low cost to remove an item in the middle once the item has been found
public class MyLinkedList {
	// keep track of number of items in this linked list
	private int numberOfItems = 0;

	// by convention data structures in java have a size() method that
	//     returns the number of items in that data structure
	public int size() {
		return numberOfItems;
	}

	/*
	5, 7, 2, 8

	[5, ->] [7, ->] [2, ->] [8, ->]
	 */

	private static class Box {
		int value;
		Box box = null;
	}

	public void add(int item) {
		++numberOfItems;


	}

	public static void main(String[] args) {
		/*
		[
		0 -> 0-255
		1 -> 0-255
		3 -> 0-255
		...
		32000000000 -> 0-255
		]
		 */
		MyLinkedList myLinkedList = new MyLinkedList();
		System.out.println(myLinkedList.size());
	}
}