package list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	
	
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>();
		vector.add("Raj");
		vector.add("Sam");
		
		for(String name: vector) 
		{
			System.out.println(name);
		}
		
		
		System.out.println("Iterate using Enumeation: ");
		
		//Using Enumeration cursor
		Enumeration<String> enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			String element = enumeration.nextElement();
			System.out.println(element);
		}
		
		
		
		
		
		
	}

}
