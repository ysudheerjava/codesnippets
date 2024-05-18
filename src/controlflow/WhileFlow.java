package controlflow;

public class WhileFlow {

	public static void main(String[] args) {
		int number = 13;

		do {
			System.out.println(number);
			number++; //number = number + 1;
		}while (number <= 10);
		System.out.println("End of the program");
	}

}
