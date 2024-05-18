package list;

import java.util.Stack;

public class StackDemo {
	
	//push  -  adding or insert
	//pop - returns and removes the top element
	//peek-  returns the top element without removing
	
	public static void main(String[] args) {
		
		
		Stack<String> bookStack= new Stack<>(); 
		bookStack.push("Java");
		bookStack.push("C");
		bookStack.push("C++");
		bookStack.push("C#");
		bookStack.push("Python"); //top LIFO
		
		System.out.println(bookStack);
		
		//popping the top element from the stack
		String poppedBook =bookStack.pop();
		System.out.println(poppedBook);
		System.out.println(bookStack);
		
		// peek
		String peekedBook = bookStack.peek();
		System.out.println(peekedBook);
		
		System.out.println(bookStack.search(peekedBook));
		
		bookStack.clear();
		System.out.println(bookStack);
				
		
		
	}

	

}
