package collection_questions;

import java.util.*;

public class CollectionsTest1 {
	/*
	 * Regular Lists were chosen for the Collections 1 and 2 to take advantage of shuffling
	 * TreeSet was chosen for Collection 3 because sets do not allow for duplicates and TreeSets are ordered
	 */
	public static List<Integer> c1;
	public static List<Integer> c2;
	public static TreeSet<Integer> c3;
	
	/*
	 * Collection 1 contains integers 1 thru 10 (random order)
	 */
	public static void fillList1() {
		c1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Collections.shuffle(c1);
	}
	
	/*
	 * Collection 2 contains integers 6 thru 15
	 */
	public static void fillList2() {
		c2 = Arrays.asList(6,7,8,9,10,11,12,13,14,15);
		Collections.shuffle(c2);
	}
	
	/*
	 * Collection 3 contains the combined elements of Collection 1 and Collection 2
	 * Collection 3 cannot have any duplicates
	 * Collection 3 must be sorted
	 */
	public static void fillTreeSet() {
		c3 = new TreeSet<Integer>();
		c3.addAll(c1);
		c3.addAll(c2);
	}
	
	public static void removeMiddleEntry(Collection<Integer> c) {
		int count = 0;
		Iterator<Integer> iter = c.iterator();
		while(iter.hasNext()) {
			if (count == c.size()/2) {
				c.remove(iter.next());
				break;
			}
			iter.next();
			count++;
		}
	}
	
	public static void print(Iterator<Integer> iter) {
		if (!iter.hasNext()) return;
		System.out.print("[");
		System.out.print(iter.next()); 
		while (iter.hasNext()) {
			System.out.print("," + iter.next());
		}
		System.out.println("]");
	}
	
	
	public static void main(String[] args) {
		// Filling Collections
		fillList1();
		fillList2();
		fillTreeSet();
		
		
		// Printing Collection contents and sizes
		System.out.print("Collection 1: ");
		print(c1.iterator());
		System.out.print("Size = ");
		System.out.println(c1.size());
		
		System.out.println();
		
		System.out.print("Collection 2: ");
		print(c2.iterator());
		System.out.print("Size = ");
		System.out.println(c2.size());
		
		System.out.println();
		
		System.out.print("Collection 3: ");
		print(c3.iterator());
		System.out.print("Size = ");
		System.out.println(c3.size());
		
		System.out.println();
		
		System.out.print("Collection 3 After Removing Middle Element: ");
		removeMiddleEntry(c3);
		print(c3.iterator());
		System.out.print("Size = ");
		System.out.println(c3.size());
		
		System.out.println();
		
		System.out.print("Collection 3 in Reverse");
		print(c3.descendingIterator());
		System.out.print("Size = ");
		System.out.println(c3.size());
	}
}
