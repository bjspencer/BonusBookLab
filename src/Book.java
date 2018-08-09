
public class Book {
	private String title;
	private String author;
	private String isbn;
	private double price;

	/**
	 * @param isbn
	 * @param author
	 * @param title
	 * @param price
	 */
	public Book() {
		String title = "";
		String author = "";
		String isbn = "";
		double price = 0.0;
	}

	public Book(String title, String author, String isbn, double price) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.price = price;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return String.format("%-35s %-25s %-20s %-20f", title, author, isbn, price);
	}

}
