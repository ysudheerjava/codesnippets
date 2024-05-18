package list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> fruitsList = new ArrayList<>();
		// add()
		fruitsList.add("Mango");
		fruitsList.add("Banana");
		fruitsList.add("Grapes");
		fruitsList.add("Guava");
		//fruitsList.add(100);
		//fruitsList.add(true);
		fruitsList.add(null);
		//fruitsList.add(100);
		fruitsList.add("Mango");
		// get()
		System.out.println(fruitsList.get(0));
		System.out.println(fruitsList.get(1));
		// size()
		System.out.println(fruitsList.size());

		System.out.println("*******************Fruits List****************");
		// Retrieving the list of fruits
		for (int i = 0; i < fruitsList.size(); i++) {
			System.out.println(fruitsList.get(i));
		}
		// Using enhanced for loop
		System.out.println("***************Using enhanced for loop*******************");
		for (String fruit : fruitsList) {
			System.out.println(fruit);
		}
		
		System.out.println(fruitsList.contains("Apple"));
		fruitsList.remove("Guava");
		fruitsList.remove(0);
		System.out.println("***************After using remove()*******************");
		for (String fruit : fruitsList) {
			System.out.println(fruit);
		}
		
		//Cleaering the elements from the list
		fruitsList.clear();
		System.out.println("***************After using clear()*******************");
		for (String fruit : fruitsList) {
			System.out.println(fruit);
		}
		
		
		
		
	}

}
