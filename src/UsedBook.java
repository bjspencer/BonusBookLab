
public class UsedBook extends Book {

	private String wear;

	/**
	 * 
	 */
	public UsedBook() {
		super();

	}

	/**
	 * @param title
	 * @param author
	 * @param isbn
	 * @param price
	 */
	public UsedBook(String title, String author, String isbn, double price, String wear) {
		super(title, author, isbn, price);
		setWear(wear);
	}

	/**
	 * @return the wear
	 */
	public String getWear() {
		return wear;
	}

	/**
	 * @param wear the wear to set
	 */
	public void setWear(String wear) {
		this.wear = wear;
	}

	@Override
	public String toString() {

		return String.format("%-35s %-25s %-20s %-20f %-10s", getTitle(), getAuthor(), getIsbn(), getPrice(),
				getWear());
	}

}
