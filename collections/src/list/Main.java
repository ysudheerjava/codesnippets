package list;

public class Main {
	
	public static void main(String[] args) {
		Library library = new Library();
		library.addBook(new Book("Java","James Gosling","Technical4", 2005));
		library.addBook(new Book("Midnight Children","Salman Rushdie","Fiction", 2005));
		library.addBook(new Book("Ramayana","Valmiki","Fiction", 2005));
		System.out.println("Retrieve the book list from Library");
		library.displayAllBooks();
		
	
	}

}
