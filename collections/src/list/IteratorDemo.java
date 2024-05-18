package list;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {

	public static void main(String[] args) {

		LinkedList<Integer> marksList = new LinkedList<>();
		marksList.add(55);
		marksList.add(45);
		marksList.add(66);

		// Get an Iterator for arrayList
		Iterator<Integer> iterator = marksList.iterator();

		// Iterate over the elements using iterator
		System.out.println("Original list:");
		while (iterator.hasNext()) {
			int mark = iterator.next();
			System.out.println(mark);
		}
		
		//Remove an element from marksList if mark is less than 50
		iterator= marksList.iterator();
		while(iterator.hasNext()) {
			int mark = iterator.next();
			if(mark<50) {
				iterator.remove();
			}
		}
		
	   //Iterate over the elements in the modified List using iterator
		iterator= marksList.iterator();
		System.out.println("Modified list:");
		while (iterator.hasNext()) {
			int mark = iterator.next();
			System.out.println(mark);
		}
		
		
		
		
		
		
		
		
		
		
		

	}
}
