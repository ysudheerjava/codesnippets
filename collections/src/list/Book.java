package list;

public class Book {
	private String title;
	private String author;
	private String genrre;
	private int publicationYear;
	
	public Book(String title, String author, String genrre, int publicationYear) {
		this.title = title;
		this.author = author;
		this.genrre = genrre;
		this.publicationYear = publicationYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenrre() {
		return genrre;
	}

	public void setGenrre(String genrre) {
		this.genrre = genrre;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	} 
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", genrre=" + genrre + ", publicationYear="
				+ publicationYear + "]";
	}

	
}
