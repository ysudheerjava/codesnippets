package exceptionhandling.checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		try {
		FileReader fileReader = new FileReader("example.txt");
		}
		catch(FileNotFoundException fo) {
			System.out.println("Please check whether the file is in the specified path");
		}
	}

}
