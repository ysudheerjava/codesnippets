package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) {

		try {
		FileReader reader = new FileReader("example.txt");
		}catch(FileNotFoundException e) {
			System.out.println("Make sure your file exists in the path specified");
		}
	}

}
